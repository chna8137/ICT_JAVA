package springaop1;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {

		ApplicationContext ctx = new GenericXmlApplicationContext("springaop1/ex1_aop.xml");

		DaoInter dao = ctx.getBean("dao", DaoInter.class);
//		dao.first();

	}

}
