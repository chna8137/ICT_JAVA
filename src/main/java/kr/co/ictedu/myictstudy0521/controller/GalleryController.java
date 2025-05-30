package kr.co.ictedu.myictstudy0521.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletRequest;
import kr.co.ictedu.myictstudy0521.service.GalleryService;
import kr.co.ictedu.myictstudy0521.vo.GalleryImagesVO;
import kr.co.ictedu.myictstudy0521.vo.GalleryVO;

@RestController
@RequestMapping("/gallery")
public class GalleryController {

	@Autowired
	private GalleryService galleryService;

	@Value("${spring.servlet.multipart.location}")
	private String uploadDir;

	@PostMapping("/add")
	public ResponseEntity<?> addGallery(@ModelAttribute GalleryVO galleryVO,
			@RequestParam("images") MultipartFile[] images, HttpServletRequest request) {

		// 작성자 IP 저장
		galleryVO.setReip(request.getRemoteAddr());

		List<GalleryImagesVO> imageList = new ArrayList<>();

		try {
			for (MultipartFile file : images) {
				if (!file.isEmpty()) {
					String originalFilename = file.getOriginalFilename();
					File f = new File(uploadDir+"/", originalFilename);
					file.transferTo(f);

					// 이미지 VO 생성
					GalleryImagesVO imageVO = new GalleryImagesVO();
					imageVO.setImagename(originalFilename);
					imageList.add(imageVO);
				}
			}

			// GalleryVO에 이미지 리스트 설정
			galleryVO.setGetimglist(imageList);

			// 서비스로 트랜잭션 처리
			try {
				galleryService.transcationProcess(galleryVO, imageList);
				System.out.println("정상적인 처리");
			} catch (Exception e) {
				System.out.println("Rollback 되었음");
			}
			return ResponseEntity.ok("갤러리 등록 성공!");
		} catch (IOException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("업로드 실패");
		}
	}

}
