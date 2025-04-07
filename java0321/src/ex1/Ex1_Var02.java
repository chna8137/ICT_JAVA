package ex1;

public class Ex1_Var02 {
public static void main(String[] args) {
	// 지역변수는 선언은 한번 한다. *************
	//	byte a; //선언
	//	a = 10; //초기화 
		byte a = 10; // 선언과 초기화 (변수에 10값을 저장)
		System.out.println(a);//사용
		//a에 값을 다시 저장 (재사용)
		//[자료형] 변수이름;
		a = 20;
		System.out.println(a);
	
	// 변수의 범위에 대해서 확인
	int value1 = 3;
	{
		int value2 = 5;
		System.out.println(value1); // 3
		System.out.println(value2); // 5
	}
	System.out.println(value1); // 3
	// 오류의 원인을 정리 해봅시다.
	// 영역안에 선언한 변수는 영역 안에서만 접근이 가능하다.
	//System.out.println(value2);
	
}
}



