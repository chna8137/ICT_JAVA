package springaop1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;

public class DaoImple implements DaoInter {

	// spring으로 부터 MyConn Bean을 자동으로 DI받는다.
	@Autowired
	private MyConn myconn;

	public DaoImple() {
		System.out.println("DaoImple 생성자 호출!");
	}

	@Override
	public void first() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.print(i + " ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	// 반환 값을 받아서 처리할 After-returning Advice
	@Override
	public String second() {
		StringBuilder sb = new StringBuilder();
		sb.append("--------------------------").append("\n");
		sb.append("After-returning Advice : 테스트").append("\n");
		sb.append("--------------------------").append("\n");
		return sb.toString();
	}

	// After-throwing Advice
	@Override
	public void third() {
		String[] ar = { "메세지1", "메세지2", "메세지3", "메세지4", "메세지5" };
		for (int i = 0; i <= ar.length; i++) {
			System.out.println("비즈니스 로직의 " + ar[i]); // 예외 발생!
		}

	}

	/*
	 * CREATE TABLE speedtest ( num NUMBER PRIMARY KEY, sname VARCHAR2(1000), sdate
	 * DATE );
	 */
	// Around Advice : Statement PrepareStatement 속도 체크
	@Override
	public String firstStatementTest(int code) {
		
		if (code == 1) { // Statement
			
			try (Connection con = myconn.getConnection();
				Statement stmt = con.createStatement();
				){
				// 10000번 반복하면서 데이터를 해당 테이블에 저장
				for(int i = 1; i <= 10000; i++) {
					StringBuilder sql = new StringBuilder();
					sql.append("insert into speedtest values(");
					sql.append(i).append(",'");
					sql.append("xman" + i).append("',");
					sql.append("sysdate)");
					System.out.println("Log1 => " + sql);
					stmt.executeUpdate(sql.toString()); // DB에 명령어가 전달됨
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} else if (code == 2) { // PrepareStatement
			StringBuilder sql = new StringBuilder();
			sql.append("insert into speedtest values(?,?,sysdate)");
			try (Connection con = myconn.getConnection();
				 PreparedStatement pstmt = con.prepareStatement(sql.toString());
				){
				for (int i = 1; i <= 10000; i++) {
					pstmt.setInt(1, i); // num
					pstmt.setString(2, "xman" + i);
					pstmt.executeUpdate();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return null;
	}

}
