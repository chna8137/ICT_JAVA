package ex8;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ex1.CustomerVO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/customerlist2")
public class CustomerListServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<String> singerList = new ArrayList<String>();
		singerList.add("소녀시대");
		singerList.add("원더걸스");
		req.setAttribute("singerList", singerList);
		List<CustomerVO> customerList = new ArrayList<CustomerVO>();
		for (int i = 0; i < 2; i++) {
			CustomerVO v = new CustomerVO();
			v.setNum(i + 1);
			v.setName("테스형" + (i + 1));
			;
			v.setEmail("tess0" + i + "@ict.co.kr");
			v.setPhone("010-5555-5555");
			v.setCdate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
			customerList.add(v);
		}
		req.setAttribute("customerList", customerList);
		req.getRequestDispatcher("ex8_ELForEach.jsp").forward(req, resp);
	}

}
