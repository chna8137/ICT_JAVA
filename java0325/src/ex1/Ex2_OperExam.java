package ex1;

import java.util.Scanner;

public class Ex2_OperExam {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("영어를 입력하세요(별과하트를 드립니다): ");
	String msg2 = sc.nextLine();
	// 첫번째 단어를 구분 해야 하기 때문에 char 변수에 저장
	char ch = msg2.charAt(0);
	System.out.println("=== 삼항 연산자 결과 ===");
	String res3 = (ch == 'k')? ch+"로 시작하는 문자는 ★을 드립니다.":
		ch+"로 시작하는 문자는 ♥를 드립니다."; 
	System.out.println(res3);
	System.out.println("======== 삼항 연산자를 if else로 변경 ===============");
	String res4="";
	if (ch == 'k') {
		res4 =ch+"로 시작하는 문자는 ★을 드립니다.";
	} else {
		res4 =ch+"로 시작하는 문자는 ♥를 드립니다.";
	}
	System.out.println(res4);
}
}
