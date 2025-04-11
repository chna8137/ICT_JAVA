package ex1;

import java.util.Scanner;

public class Ex3_DigitsDemo1 {
public static void main(String[] args) { // 메인 메서드의 시작
	Scanner sc = new Scanner(System.in);
	String numStr;
	while(true) {
	System.out.print("숫자만 입력");
	numStr = sc.nextLine();
	System.out.println("입력값:"+numStr);
	boolean chk = isAllDigits(numStr);
	if(chk) {
		break; //반복문을 종료
	}
	System.out.println("숫자만 입력하세요");
	}
	System.out.println("결과:"+numStr);
	int num = Integer.parseInt(numStr);
	System.out.println("입력한 값 =>"+num);
} // 메인 메서드의 종료
	// char ch = msg.charAt(0);
	// public char charAt(int n) {
	//  return '문자';
    // }
	// boolean chk = isAllCheck(10);
	private static boolean isAllCheck(int n) {
		if(n < 10) {
			return false;
		}else {
			return true;
		}
	}
	private static boolean isAllDigits(String s) {
		// String s = "11"; or String s = "A11";
		// "A11" -> char c: 'A' , char c: '1' , char c: '1'
		// for문이 동작하면서 "A11" 문자열에서 한문자씩 char c에 저장하면 실행
		/*
		for(char c : "111") {
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		char c = 'A';
		System.out.println(Character.isDigit(c)); //false
		
		c = '1';
		System.out.println(Character.isDigit(c)); //true
		*/
		for(char c : s.toCharArray()) {
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}




}
