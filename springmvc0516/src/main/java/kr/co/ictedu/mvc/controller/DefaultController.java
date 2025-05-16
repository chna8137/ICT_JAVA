package kr.co.ictedu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
	
	@GetMapping(value = {"/main", ""})
	public String main(Model m) {
		
		m.addAttribute("msg", "�ȳ��ϼ��� ���� ù MVC!");
		// WEB-INF/views/main/index.jsp
		return "main/index";
	}

}
