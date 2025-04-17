package ex2;
//클래스 정의
//구성 : 속성, 메서드 
//접근제한자 : public > protected > default > private
// default는 표시를 생략함.
public class Ex1_Obj {
	// 멤버들은 반드시 접근제한자가 있어야 한다.
	//  속성: 멤버필드, 멤버 변수
	//  <인스턴스 변수> : new란 연산자로 현재 클래스를 [객체]로 생성한 후 접근 *****
	//  정적변수(static) 변수 : 생성없이 오직 하나만 static이란 메모리 영역을 참조해서 사용
	//  -> static은 생성없이 , 모든 객체들이 공유할 목적으로도 사용한다.
	//[접근제한자] int num1 =100;
	// 접근제한자가 default인 멤버필드 num1을 선언하고 100으 초기화 한것이다.
	 int  num1 =100;
	// 메서드 
//	public void aa() {
//		int num2 = 200;
//	}
	public static void main(String[] args) {
		//클래스 변수  = new 클래스();
		Ex1_Obj ref = new Ex1_Obj();
		System.out.println(ref.num1); //100
		ref.num1 = 1000;
		System.out.println(ref.num1); //1000
	}
	
	
}
