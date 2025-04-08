package ex1;

import java.util.Scanner;
//약속) 대문자 -> 클래스 (공구통) -> 단축키 
//외부에 있는 클래스를 불러 오기 위한 문법 -> import 
//SCanner  -> java.util.SCanner 
//import java.util.Scanner;
public class Ex7_Scanner {
public static void main(String[] args) {
	//키보드 입력받기 위한 클래스를 생성하세요.
	Scanner sc = new Scanner(System.in);
	System.out.print("첫번째 메세지:"); //사용자에게 보여지는 출력
	String msg = sc.nextLine(); //  입력한 값을 msg에 저장
	System.out.println("당신이 입력한 첫번째 메세지 =>"+msg);
	System.out.print("두번째 메세지:"); //사용자에게 보여지는 출력
	String msg2 = sc.nextLine(); // 입력 값을 msg2에 저장
	System.out.println("당신이 입력한 두번째 메세지 =>"+msg2);
}
}
/*
 * 	//지역변수 선언, 참조
	String msg;
	Scanner sc;
	msg = "안녕하세요";
	//System.in - 표준입력 , System.out -> 표준출력
	sc = new Scanner(System.in); //입력과 관련된 공구상자가 생긴다.
	
	//일반 변수 , 참조 변수
	//int num = 10;
	//Integer num2 = 30;
 * */
