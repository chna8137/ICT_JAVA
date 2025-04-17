package demo;

import classpart.Student;

public class TestReturnMethod01 {
	
	//[접근제한자] [반환형 or void] 메서드이름(자료형 변수1, 자료형 변수2,,,){
	//실행문;
	// void가 아닐때 [return 반환값]
	//}
	// int m = 10;
	public int method1() {
		
		return 10;
	}
	// Student st = new Student();
	// st.sname="테스형";
	public Student method2() {
		Student st = new Student();
		st.sname="테스형";
		return st;
	}
}
