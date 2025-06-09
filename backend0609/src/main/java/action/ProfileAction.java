package action;

import java.io.IOException;

import control.ActionForward;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ProfileAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		request.setAttribute("name", "테스형");
		request.setAttribute("age", "12");
		return new ActionForward("profile", false);
	}

}
