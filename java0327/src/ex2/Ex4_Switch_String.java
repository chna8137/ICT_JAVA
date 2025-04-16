package ex2;

import java.util.Scanner;

//String -> 명시적(new), 묵시적("")
public class Ex4_Switch_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("msg1 =>");
		String msg1 = sc.nextLine(); //new
		System.out.print("msg2 =>");
		String msg2 = sc.nextLine(); //new
		System.out.println(msg1 == msg2);//주소 다르다 - 동일한 입력값
		System.out.println(msg1.equals(msg2)); // 내용 비교 - 동일할 때 True
		System.out.println(msg1 == "Test"); // false
		System.out.println("------------------");
		// msg1 과 case1은 주소비교일까요? 내용 비교?
		// switch문은 내부적으로 equals 적용이 된 것.
		switch(msg1) {
		case "Test": System.out.println("입력값이 Test 이다.");break;
		default : System.out.println("입력값이 Test와 다르다.");
		}
		// if else
		if (msg1.equals("Test")) {
			 System.out.println("입력값이 Test 이다.");
		} else {
			System.out.println("입력값이 Test와 다르다.");
		}
		//문자열일때 nextLine() 외부에서 받는 문자열 일경우
		//내용을 비교하는 메서드인 equals() 사용해서 비교해라.
		//switch 이미 내부적으로 포함!
	}
}
