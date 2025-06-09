package control;

import java.io.IOException;
import java.io.PrintWriter;

import action.Action;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 모든 요청을 ControllerServlet이 받도록 설정
// url => main.ict?cmd=?
@WebServlet("*.ict")
public class ControllerServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String cmd = req.getParameter("cmd");
		if (cmd != null) {
			// cmd -> ActionFactory
			// A) cmd == index => Action action = new IndexAction();
			// B) cmd == hello => Action action = new HelloAction();
			// A) action.execute(req, resp);
			// B) action.execute(req, resp);
			// 1. ActionFactory 생성한다.
			ActionFactory factory = ActionFactory.getInstance();
			Action action = factory.getAction(cmd);
			ActionForward af = action.execute(req, resp);
			System.out.println(af.getUrl());
			
			if(af.isMethods()) {
				resp.sendRedirect(af.getUrl());
			} else {
				String viewName = "/WEB-INF/views/" + af.getUrl() + ".jsp";
				req.getRequestDispatcher(viewName).forward(req, resp);
			}
		} else {
			resp.setContentType("text/html;charset=utf-8");
			PrintWriter out = resp.getWriter();
			out.println("<h2 style=\"color:red\">올바른 요청이 아닙니다.");
			out.println("</h2>");
		}
	}

}
