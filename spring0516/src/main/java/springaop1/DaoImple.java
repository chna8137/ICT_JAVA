package springaop1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;

public class DaoImple implements DaoInter {

	// spring���� ���� MyConn Bean�� �ڵ����� DI�޴´�.
	@Autowired
	private MyConn myconn;

	public DaoImple() {
		System.out.println("DaoImple ������ ȣ��!");
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

	// ��ȯ ���� �޾Ƽ� ó���� After-returning Advice
	@Override
	public String second() {
		StringBuilder sb = new StringBuilder();
		sb.append("--------------------------").append("\n");
		sb.append("After-returning Advice : �׽�Ʈ").append("\n");
		sb.append("--------------------------").append("\n");
		return sb.toString();
	}

	// After-throwing Advice
	@Override
	public void third() {
		String[] ar = { "�޼���1", "�޼���2", "�޼���3", "�޼���4", "�޼���5" };
		for (int i = 0; i <= ar.length; i++) {
			System.out.println("����Ͻ� ������ " + ar[i]); // ���� �߻�!
		}

	}

	/*
	 * CREATE TABLE speedtest ( num NUMBER PRIMARY KEY, sname VARCHAR2(1000), sdate
	 * DATE );
	 */
	// Around Advice : Statement PrepareStatement �ӵ� üũ
	@Override
	public String firstStatementTest(int code) {
		
		if (code == 1) { // Statement
			
			try (Connection con = myconn.getConnection();
				Statement stmt = con.createStatement();
				){
				// 10000�� �ݺ��ϸ鼭 �����͸� �ش� ���̺� ����
				for(int i = 1; i <= 10000; i++) {
					StringBuilder sql = new StringBuilder();
					sql.append("insert into speedtest values(");
					sql.append(i).append(",'");
					sql.append("xman" + i).append("',");
					sql.append("sysdate)");
					System.out.println("Log1 => " + sql);
					stmt.executeUpdate(sql.toString()); // DB�� ��ɾ ���޵�
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
