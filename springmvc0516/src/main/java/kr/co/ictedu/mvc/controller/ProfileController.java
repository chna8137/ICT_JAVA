package kr.co.ictedu.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {
	
	@GetMapping("/myProfile")
	public String myProfile(Model m) {
		List<String> myinfoList = new ArrayList();
		myinfoList.add("�̸� : �׽���");
		myinfoList.add("���� : 20");
		myinfoList.add("��� �� : ����");
		m.addAttribute("list", myinfoList);
		return "main/myprofile";
	}

}
