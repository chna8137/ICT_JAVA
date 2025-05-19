package kr.co.ictedu.mvc.controller.fboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ictedu.mvc.dao.FBoardDao;
import kr.co.ictedu.mvc.dao.FboardDaoInter;
import kr.co.ictedu.mvc.dto.FboardDTO;

@Controller
public class FboardController {

	// Dao를 불러와서 list를 출력
	// FBoardDaoInter주소를 DI
	@Autowired
	private FboardDaoInter fBoardDao;

	// write.jsp 실행
	@GetMapping("/fboardForm")
	public String fboardForm() {
		return "/fboard/write";
	}

	// form의 입력을 받아서 처리
	// <form method="post" action="fboardInsert" autocomplete="off">
	@PostMapping("/fboardInsert")
	// 매개변수로 DTO를 선언만 해도 form의 파라미터를 자동으로 받아줌
	public String fboardInsert(FboardDTO vo) {

		System.out.println("subject : " + vo.getSubject());

		fBoardDao.addFBoard(vo);

		return "redirect:fboardList";
	}

	@GetMapping("/fboardList")
	// view로 전달하기 위한 객체를 spring으로 부터 호출 시 주입 받을 수 있다.
	public String fboardList(Model m) {

		// MyBatis로부터 데이터를 받아 온 List 객체를 반환 받기
		// 인터페이스의 추상메서드의 반환형을 자료형으로 선언해서 변수로 값을 저장
		// 그리고 view로 값을 전달하기
		List<FboardDTO> flist = fBoardDao.listFBoard();
		m.addAttribute("flist", flist);

		return "/fboard/list"; // view의 위치를 문자열로 반환
	}

	@GetMapping("/fboardHit")
	public String fboardHit(int num) {

		fBoardDao.updateHit(num);

		return "redirect:fboardDetail?num=" + num;
	}

	@GetMapping("/fboardDetail")
	public String fboardDetail(int num, Model model) {

		FboardDTO v = fBoardDao.detailFBoard(num);

		model.addAttribute("v", v);

		return "/fboard/info";

	}

	@GetMapping("/fboardUpdateForm")
	public String fboardUpdateForm(FboardDTO vo, Model model) {


		model.addAttribute("v", vo);

		return "/fboard/update";
	}

	@PostMapping("/fboardUpdate")
	public String fboardUpdate(FboardDTO vo, Model model) {

		fBoardDao.updateBoard(vo);

		model.addAttribute("v", vo);

		return "redirect:fboardList";
	}

	@PostMapping("/fboardDelete")
	public String fboardDelete(int num) {

		fBoardDao.deleteBoard(num);

		return "/fboard/list";
	}

}
