package ex2;

import java.io.IOException;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/customermap")
public class CustomerMapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "소나타");
		map.put("maker", "현대자동차");
		req.setAttribute("car", map);
		req.getRequestDispatcher("ex2_EL.jsp").forward(req, resp);
		
	}

}
