package kr.co.ictedu.myictstudy.memo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.co.ictedu.myictstudy.service.MemoService;
import kr.co.ictedu.myictstudy.vo.MemoVO;

@RestController
@RequestMapping("/memo")
public class MemoController {
	
	// Service <- VO -> Dao <- vo -> mapper
	@Autowired
	private MemoService memoService;
	
	@RequestMapping("/list")
	// public List<MemoVO> list()
	public List<MemoVO> memoList() {
		return memoService.list();
	}
	
	@PostMapping("/add")
	// public void add(MemoVO vo) 
	public ModelAndView addMemo(@RequestBody MemoVO vo) {
		
		System.out.println(vo.getWriter());
		System.out.println(vo.getConts());
		System.out.println(vo.getMreip());
		
		memoService.add(vo);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:list");
		return mav;
	}
	
	@GetMapping("/detail")
	public MemoVO detailMemo(@RequestParam("num") int num) {
		
		System.out.println("num : " + num);
		
		return memoService.detail(num);
	}
	
	@RequestMapping("/update")
	public void update(@RequestParam("num") int num) {
		
		MemoVO vo = new MemoVO();
		vo.setNum(num);
		vo.setWriter("구스형");
		vo.setConts("집가고싶다");
		
		memoService.update(vo);
	}
	
	@PostMapping("/delete")
	public void del(@RequestParam("num") int num) {
		
		memoService.del(num);
	}
	
	

}
