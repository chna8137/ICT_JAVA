package ex1;

// Spring Container에서 관리도힐 기본 클래스를 정의한다.
public class Ex1_Hello {
	
	private String msg;
	public Ex1_Hello() {
		System.out.println("생성자 호출!");
	}
	
	// 비즈니스 메서드
	public String printHello() {
		return "나는 테스형 " + msg;
	}

	// 스프링으로부터 msg값을 받을 메서드 정의
	// property
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
