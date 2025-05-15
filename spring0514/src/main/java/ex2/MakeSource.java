package ex2;

// MySource 객체를 스프링에 의해서 DI 받아서 사용하는 객체
// MakeSource(빈) ---참조---> MySource(빈)
// MakeSource가 MySource를 스프링에 의해서 주입 받아야 한다면,
// 멤버필드와 setter 또는 생성자가 필요하다.
// 필요로 하는 쪽 멤버필드에서 setter 또는 생성자가 필요하다.
public class MakeSource {
	// 통칭 property로 등록한다.
	private MySource source;

	public void setSource(MySource source) {
		this.source = source;
		System.out.println("MakeSource Setter 주소값 => " + source);
	}
	
	// MySource에서 제공하는 메서드를 호출할 메서드
	public String result() {
		System.out.println(source.reTrunSource());
		return source.reTrunSource();
	}
	

}
