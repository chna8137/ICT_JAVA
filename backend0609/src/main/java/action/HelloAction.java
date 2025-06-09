package action;

import java.io.IOException;

import control.ActionForward;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		request.setAttribute("msg", "hello");
		// forward방식으로 hello.jsp가 실행된다.
		return new ActionForward("hello", false);
	}

}
