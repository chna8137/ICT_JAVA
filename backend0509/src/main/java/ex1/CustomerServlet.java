package ex1;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.beanutils.BeanUtils;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/customer")
public class CustomerServlet extends HttpServlet {
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
		CustomerVO vo = new CustomerVO();
		vo.setNum(1);
//		vo.setName("테스형");
//		vo.setEmail("tess01@ict.co.kr");
//		vo.setPhone("02-1010-8888");
		
		try {
			BeanUtils.populate(vo, req.getParameterMap());
		} catch(Exception e) {
			e.printStackTrace();
		}
		vo.setCdate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		req.setAttribute("customer", vo);
		req.getRequestDispatcher("ex1_EL.jsp").forward(req, resp);
//		req.getRequestDispatcher("customerForm.jsp").forward(req, resp);
		
	}
}
