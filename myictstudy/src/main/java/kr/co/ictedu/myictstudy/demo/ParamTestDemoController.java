package kr.co.ictedu.myictstudy.demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.co.ictedu.myictstudy.vo.MemoVO;

@RestController
@RequestMapping("/demo") // 모든 요청에서 memo라고 왔을 때 현재 컨트롤러가 응답
public class ParamTestDemoController {
	
	@PostMapping("/add")
	public ModelAndView addMemo(MemoVO vo) {
		
		System.out.println(vo.getWriter());
		System.out.println(vo.getConts());
		System.out.println(vo.getMreip());
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:list");
		
		return mav;
	}
	
	// json형식으로 출력 해준다. -> @RestController 설정값이다.
	@RequestMapping("/list")
	public List<MemoVO> memoList(Model m) {
		
		List<MemoVO> list = new ArrayList<>();
		
		// 임의의 데이터를 MemoVO에 저장한 후 list에 하나씩 등록 해보기
		for(int i = 0; i < 3; i++) {
			
			MemoVO vo = new MemoVO();
			vo.setNum(i+1);
			vo.setWriter("구구게게" + i);
			vo.setConts("이것은 무엇이게요?" + i);
			vo.setMreip("192.168.0" + i);
			vo.setMdate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
			
			list.add(vo);
		}
		
		return list;
	}
	
	// @RequestBody : Post 방식으로 데이터가 json형식으로 전송되어 올 때 DTO에 저장하기 위한 방법
	@PostMapping("/addJson")
	public ModelAndView addMemoJson(@RequestBody MemoVO vo) {
		
		System.out.println(vo.getWriter());
		System.out.println(vo.getConts());
		System.out.println(vo.getMreip());
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:list");
		
		return mav;
	}
	
	// @RequestParam("paramName") => memo?num=123 쿼리 파라미터
	@GetMapping("/detail")
	public MemoVO detailMemo(@RequestParam("num") int num) {
		
		System.out.println("num => " + num);
		
		MemoVO vo = new MemoVO();
		vo.setNum(num);
		vo.setWriter("테스형1");
		vo.setConts("안녕");
		return vo;
	}
	
	// @RequestParam(value="ParamName"m defaultValue="기본값")
	@GetMapping("/uname")
	public String getMemo(@RequestParam(value="writer", defaultValue = "테스형") String writer) {
		
		return "작성자 : " + writer;
	}
	
	@GetMapping("/mybooks/{num2}")
	public String getMemo(@PathVariable("num2") int num) {
		
		System.out.println("PathVariable num : " + num);
		
		return "Memo 번호 : " + num;
	}
	
	@PostMapping("/mybooks/{writer}/{conts}")
	public String postMemo(
			@PathVariable("writer") String writer,
			@PathVariable("conts") String conts) {
		
		System.out.println("작성자 : " + writer);
		System.out.println("내용 : " + conts);
		
		return "작성 완료";
	}
	
	@GetMapping("/yourbooks/{num}")
	public String getBook(@RequestParam(value = "writer", defaultValue = "테스형") String writer,
			@PathVariable("num") int num) {
		System.out.println("번호 : " + num);
		System.out.println("작성자 : " + writer);
		
		return "번호 : " + num + ", 작성자 : " + writer; 
	}
	
	// Header : 브라우저 정보 등을 Header를 사용해서 받을 수 있음
	@GetMapping("/agent")
	public String userAgent(@RequestHeader("User-Agent") String userAgent) {
		
		System.out.println("userAgent : " + userAgent);
		String browser = "알 수 없음";
		if(userAgent.contains("Edg/")) {
			browser = "마이크로소프트 엣지 브라우저";
		} else if(userAgent.contains("Chrome/")) {
			browser = "Chrome 브라우저";
		}
		return browser;
	}
	
	// @RequestHeader를 사용해서 Authorization 인증 헤더 값을 받아오기
	// Postman : Bearer Token 임의의 토큰 보내기
	@GetMapping("/auth")
	public String auth(@RequestHeader("Authorization") String authHeader) {
		return "인증된 토큰 값 : " + authHeader;
	}
	

}
