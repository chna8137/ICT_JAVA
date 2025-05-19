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

	// Dao�� �ҷ��ͼ� list�� ���
	// FBoardDaoInter�ּҸ� DI
	@Autowired
	private FboardDaoInter fBoardDao;

	// write.jsp ����
	@GetMapping("/fboardForm")
	public String fboardForm() {
		return "/fboard/write";
	}

	// form�� �Է��� �޾Ƽ� ó��
	// <form method="post" action="fboardInsert" autocomplete="off">
	@PostMapping("/fboardInsert")
	// �Ű������� DTO�� ���� �ص� form�� �Ķ���͸� �ڵ����� �޾���
	public String fboardInsert(FboardDTO vo) {

		System.out.println("subject : " + vo.getSubject());

		fBoardDao.addFBoard(vo);

		return "redirect:fboardList";
	}

	@GetMapping("/fboardList")
	// view�� �����ϱ� ���� ��ü�� spring���� ���� ȣ�� �� ���� ���� �� �ִ�.
	public String fboardList(Model m) {

		// MyBatis�κ��� �����͸� �޾� �� List ��ü�� ��ȯ �ޱ�
		// �������̽��� �߻�޼����� ��ȯ���� �ڷ������� �����ؼ� ������ ���� ����
		// �׸��� view�� ���� �����ϱ�
		List<FboardDTO> flist = fBoardDao.listFBoard();
		m.addAttribute("flist", flist);

		return "/fboard/list"; // view�� ��ġ�� ���ڿ��� ��ȯ
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
