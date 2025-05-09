package exam;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/gugudanServlet")
public class GugudanServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int dan = Integer.parseInt(req.getParameter("dan"));
		int limit = Integer.parseInt(req.getParameter("limit"));
		int start = dan - (limit/2);
		int end = dan + (limit/2);
		String color = req.getParameter("color");
		
		req.setAttribute("dan", dan);
		req.setAttribute("limit", limit);
		req.setAttribute("start", start);
		req.setAttribute("end", end);
		req.setAttribute("color", color);
		req.getRequestDispatcher("gugudan.jsp").forward(req, resp);
	}
}
