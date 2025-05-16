package springaop1;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

public class MyConn {
	
	@Autowired
	private DataSource dataSource;
	
	public Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}
	

}
