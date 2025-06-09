package factory;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FactoryService {

	private static SqlSessionFactory factory;

	static {
		try (Reader reader = Resources.getResourceAsReader("config/config.xml");) {
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

//	getFactory() 호출이 될 때 MyBatis설정을 읽어 들인 SqlSessionFactory를 반환한다. *****
	public static SqlSessionFactory getFactory() {
		return factory;
	}
	

}
