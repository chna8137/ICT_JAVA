package action;

import java.io.IOException;

import control.ActionForward;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class IndexAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// 모델이 실행(excute() 메서드가 호출이 될 때)
		request.setAttribute("msg", "index");
		
		return new ActionForward("index", false);
	}

}
