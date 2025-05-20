package kr.co.ictedu.myictstudy.main;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestMainController {
	
	@GetMapping(value = {"/main", "/"})
	public String mainPage(Model m) {
		
		System.out.println("메인이 실행이 됨");
		
		return "안녕하세요~ 나의 첫 스프링 부트입니다.";
	}

}
