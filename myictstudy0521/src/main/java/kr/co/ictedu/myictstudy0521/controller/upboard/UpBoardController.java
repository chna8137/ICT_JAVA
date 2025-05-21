package kr.co.ictedu.myictstudy0521.controller.upboard;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletRequest;
import kr.co.ictedu.myictstudy0521.service.UpBoardService;
import kr.co.ictedu.myictstudy0521.vo.PageVO;
import kr.co.ictedu.myictstudy0521.vo.UpBoardVO;

@RestController
@RequestMapping("/upboard")
public class UpBoardController {
	
	@Autowired
	private UpBoardService upBoardService;
	
	@Autowired
	private PageVO pageVO;
	
	// @Value : application.propertires의 key값으로 설정값을 가져와서 변수에 저장한다.
	// 파일의 위치의 키값 불러오기
	@Value("${spring.servlet.multipart.location}")
	private String filePath;
	
	@GetMapping("/getPath")
	public String getPathTest() {
		System.out.println("path : " + filePath);
		return filePath;
	}
	
	// <form method="post" action="upboardAdd" enctype="multipart/form-data">
	//<input type="file" name=mfile"></form>
	// 파일 업로드는 Post 방식 ***
	@PostMapping("/upboardAdd")
	public ResponseEntity<?> upboardAdd(UpBoardVO vo, HttpServletRequest request) {
		
		// VO에 클라이언트 아이피 저장
		vo.setReip(request.getRemoteAddr());
		System.out.println("writer : " + vo.getWriter());
		System.out.println("title : " + vo.getTitle());
		System.out.println("content : " + vo.getContent());
		System.out.println("mfile : " + vo.getMfile().getOriginalFilename());
		System.out.println("=====================");
		// temp에 저장이 된 상태
		MultipartFile mf = vo.getMfile();
		String oriFn = mf.getOriginalFilename();
		
		StringBuilder path = new StringBuilder();
		path.append(filePath).append("\\");
		path.append(oriFn);
		System.out.println("FullPath : " + path);
		
		File f = new File(path.toString());
		// f에 저장돈 파일객체를 사용해서 파일의 내용을 읽어와서 한 바이트씩 f에서 잡은 경로로 작성
		// 개념 : InputStream read()-> while -> BufferedOutputStream write(f)
		// transferTo() : MultipartFile 를 사용해서 파일을 복제한다.
		try {
			mf.transferTo(f);
			// 업로드 된 파일의 이름을 vo에 저장한다.
			vo.setImgn(oriFn);
			// Mapper로 vo 주소 값을 보낸다.
			upBoardService.add(vo);
			return ResponseEntity.ok().body("업로드 성공!");
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		// 실패 했을 경구 응답 처리
		return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("업로드 실패");
	}
	
	@RequestMapping("/upList")
	// List<UpBoardVO> 를 사용하지 않고 Map<String, Object> 를 사용하는 이유
	// 데이터 뿐만이 아니라 페이지 처리를 위한 부가 정보도 함께 보낼 때 편해서 사용
	public Map<String, Object> upBoardList(@RequestParam Map<String, String> paramMap, HttpServletRequest request) {
		
		System.out.println("Method => " + request.getMethod());
		// Map의 키값이 파라미터
		// 현재 페이지 값
		String cPage = paramMap.get("cPage");
		System.out.println("cPage : " + cPage);
		System.out.println("****************************");
		
		// 1. 총 게시물의 수
		int totalCnt = upBoardService.totalCount();
		pageVO.setTotalRecord(totalCnt);
		System.out.println("totalCnt => " + pageVO.getTotalRecord());
		System.out.println("****************************");
		
		// 2. 총 페이지 수 구하기 => totalCnt 총 게시물 수 / numPerPage 한 페이지당 보여질 게시물 수
		// 11개의 데이터 -> 11 / 10.0 => 1.1 => 2
		int totalPage = (int) Math.ceil(totalCnt/ (double) pageVO.getNumPerPage());
		pageVO.setTotalPage(totalPage);
		System.out.println("totalPage => " + pageVO.getTotalPage());
		System.out.println("****************************");
		
		// 3. 총 블록 수 저장
		// 전체 페이지 / pagePerBlock
		// [1][2][3][4][5] | [6][7][8][][]
		int totalBlock = (int) Math.ceil(totalPage / (double) pageVO.getPagePerBlock());
		pageVO.setPagePerBlock(totalBlock);
		System.out.println("totalBlock => " + pageVO.getPagePerBlock());
		System.out.println("****************************");
		
		// 4. 현재 페이지 설정
		if(cPage != null) {
			pageVO.setNowPage(Integer.parseInt(cPage));
		} else {
			pageVO.setNowPage(1);
		}
		System.out.println("cPage : " + pageVO.getNowPage());
		System.out.println("****************************");
		
		// 현재 페이지의 시작 게시물과 끝 게시물의 번호를 계산해서 pageVo에 저장한다.
		// 공식에 값을 대입해서 결과를 예측 해보자
		// cPage가 1일 때 = 1 - 1 * 10 + 1
		// 시작페이지가 0이면 안되기 때문에 1을 더함 => 1
		// cPage가 2일 때 = 2 - 1 * 10 + 1 => 11
		pageVO.setBeginPerPage((pageVO.getNowPage() -1) * pageVO.getNumPerPage() + 1);
		pageVO.setEndPerPage(pageVO.getBeginPerPage() + pageVO.getNumPerPage() - 1);
		System.out.println("5. beginPerPage = " + pageVO.getBeginPerPage());
		System.out.println("5. endPerPage = " + pageVO.getEndPerPage());
		System.out.println("****************************");
		
//		Map<String, String> map = new HashMap<>();
//		map.put("begin", String.valueOf(1));
//		map.put("end", String.valueOf(10));
//		return upBoardService.list(map);
		
		// 6. Json으로 메서드가 반환할 타입이고 그 데이터를 저장할 맵
		Map<String, Object> response = new HashMap<>();
		
		// 기존의 paramMap에 새로운 데이터를 추가한다. (시작과 끝 번호를 추가)
		// mapper에서 사용할 값들을 포함한다.
		Map<String, String> map = new HashMap<>(paramMap);
		map.put("begin", String.valueOf(pageVO.getBeginPerPage()));
		map.put("end", String.valueOf(pageVO.getEndPerPage()));
		
		// 페이징 처리 결과 데이터가 저장되어 반환
		List<UpBoardVO> list = upBoardService.list(map);
		System.out.println("List Size => " + list.size());
		
		// 7. 페이지 블록을 구현
		int startPage = ((pageVO.getNowPage() - 1) / pageVO.getPagePerBlock()) * pageVO.getPagePerBlock() + 1;
		int endPage = startPage + pageVO.getPagePerBlock() - 1;
		
		// 블록 초기화 전체 페이지 값보다 크다면 전체 페이지 값을 마지막 블록 페이지 값으로 저장
		if(endPage < pageVO.getTotalPage()) {
			endPage = pageVO.getTotalPage();
		}
		System.out.println("6. startPage => " + startPage);
		System.out.println("6. endPage => " + endPage);
		
		response.put("data", list); // 페이징 처리가 완료된 리스트를 저장한 데이터
		response.put("totalItems", pageVO.getTotalRecord()); // 전체 게시물의 수 count
		response.put("totalPages", pageVO.getTotalPage()); // 전체 페이지
		response.put("currentPage", pageVO.getNowPage()); // 현재 페이지
		response.put("startPage", startPage); // 시작
		response.put("endPage", endPage); // 시작
		return response;
		
	}

}
