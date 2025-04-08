package ex1;
//상수 : 프로그램 영역안에서 한번 지정하면 변경할 수 없는 값을 말한다.
//final을 사용함.
//명명규칙 : 대문자로 작성한다. 변수처럼 소문자로 작성하는 경우도 있다.
public class Ex6_Constant {
	// 클래스영역 선언하는 변수는 <멤버영역>필드(변수,상수)
	// ......
	public static void main(String[] args) {
		//메인 메서드의 영역(지역)
		//상수- 지역
		final int MIN_NUM2 = 13222;
		
		System.out.println(MIN_NUM2);
		//MIN_NUM2 = 1000; // 상수는 변경할 수 없다.
		final int MIN_NUM; // 상수를 선언 , 초기화 안됨
		MIN_NUM =10; //초기화
		System.out.println(MIN_NUM);
		final int MIN_NUM3; //상황에 따라 동적 초기화
		//둘중에 하나 
		if(false) {
			MIN_NUM3 = 200;
		}else {
			MIN_NUM3 = 100;
		}
		System.out.println(MIN_NUM3);
	}
}
