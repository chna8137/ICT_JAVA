package ex1;

// Spring Container���� �������� �⺻ Ŭ������ �����Ѵ�.
public class Ex1_Hello {
	
	private String msg;
	public Ex1_Hello() {
		System.out.println("������ ȣ��!");
	}
	
	// ����Ͻ� �޼���
	public String printHello() {
		return "���� �׽��� " + msg;
	}

	// ���������κ��� msg���� ���� �޼��� ����
	// property
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
