package ex1;
//지역변수는 무조건 초기화 해서 사용이 가능하다. ***
//요점 지역변수와 변수의 선언과 초기화에 대해서 학습한다.
public class Ex1_Var01 {
	
	public static void main(String[] args) {
		//변수 문법 
		//변수 선언 : [자료형] 변수이름;
		//같은 이름의 변수는 같은 영역에서 두번 선언 할 수 없다.
		//지역변수 
		byte num = 0;
		
		//출력 해보기
		System.out.println("지역변수 출력:");
		System.out.println(num);
	}
}
