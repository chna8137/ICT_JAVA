package ex1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@WebServlet("/myProfileServlet")
public class MyProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// ApplicationContext 스프링 컨테이너를 선언
	private ApplicationContext ctx;

	// 생성자
	public MyProfileServlet() {
	}

	// int 메서드에서 스프링 컨테이너를 초기화
	@Override
	public void init() throws ServletException {
		ctx = new GenericXmlApplicationContext("ex1/ex2_MyProfile.xml");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Ex2_MyProfile mp = ctx.getBean("ex2", Ex2_MyProfile.class);
		String myProfile = mp.printProfile();
		req.setAttribute("myProfile", myProfile);
		req.getRequestDispatcher("ex2_myprofile.jsp").forward(req, resp);
	}
}