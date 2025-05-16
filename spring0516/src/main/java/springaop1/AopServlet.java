package springaop1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@WebServlet("/aopServlet")
public class AopServlet extends HttpServlet {

	// jndi는 당연히 Tomcat에서 Connection Pool로 Connection을 관리하기 때문에
	// jdni는 즉 DataSource는 웹환경에서 테스트를 해야 한다. main에서는 테스트 X
	private static final long serialVersionUID = 1L;

	private ApplicationContext ctx;

	@Override
	public void init() throws ServletException {
		ctx = new GenericXmlApplicationContext("springaop1/ex1_aop.xml");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		MyConn con = ctx.getBean("myconn", MyConn.class);
//		try (Connection conn = con.getConnection()) {
//			System.out.println("Connection Test => " + conn);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		// 테스트
		DaoInter dao = ctx.getBean("dao", DaoInter.class);
		String res = dao.firstStatementTest(2);
		System.out.println("Res : " + res);
	}

}
