package ex2;

public class MySource {
	
	private String source;
	// 생성자를 사용해서 Spring으로 부터 문자열을 인자로 받아서
	// 멤버필드에 저장한다.
	public MySource(String source) {
		this.source = source;
		System.out.println("생성자를 통해서 주입 받은 값 : " + source);
	}
	
	public String reTrunSource() {
		StringBuilder sb = new StringBuilder();
		sb.append("DI 실습 : ");
		// Spring에 의해서 생성자로 문자열을 저장한 값을
		// StringBuilder 객체에 저장해서 반환한다.
		sb.append(source);
		return sb.toString();
	}

}
