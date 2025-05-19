package kr.co.ictedu.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
	
	@GetMapping(value = {"/main", ""})
	public String main() {
		return "main/index";
	}

}
