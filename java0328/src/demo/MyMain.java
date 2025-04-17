package demo;
//여기는 프로그램의 시작인 main메서드가 존재하는 클래스
//UI클래스, 사용자클래스, Front클래스 ~ 표현이 가능하다.
public class MyMain {
	
public static void main(String[] args) {
	//참조자료형(클래스이름) 변수 = new 참조자료형();//호출 -> 생성한다.
	//Scanner sc = new Scanner();
	//A란 클래스를 객체로 생성하는 방법 
	//A ref = new A();
	//sc.nextLine();
	//생성된 객체를  참조해서 사용하는 방법
	//ref.aa();
	A ref;
	ref = new A();
	ref.aa();
}
}
