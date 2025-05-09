package ex7;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ex7servlet")
public class Ex7Servlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int start = Integer.parseInt(req.getParameter("start"));
		int end = Integer.parseInt(req.getParameter("end"));
		int range = Integer.parseInt(req.getParameter("range"));
		
		req.setAttribute("start", start);
		req.setAttribute("end", end);
		req.setAttribute("range", range);
		req.getRequestDispatcher("ex7_forEachChoose.jsp").forward(req, resp);
	}

}
