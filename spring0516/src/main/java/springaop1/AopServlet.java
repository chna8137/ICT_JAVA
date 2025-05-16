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

	// jndi�� �翬�� Tomcat���� Connection Pool�� Connection�� �����ϱ� ������
	// jdni�� �� DataSource�� ��ȯ�濡�� �׽�Ʈ�� �ؾ� �Ѵ�. main������ �׽�Ʈ X
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
		
		// �׽�Ʈ
		DaoInter dao = ctx.getBean("dao", DaoInter.class);
		String res = dao.firstStatementTest(2);
		System.out.println("Res : " + res);
	}

}
