package ex1;

import java.util.Scanner;

//숫자인지 아닌지를 체크하는 2번째 방법 -> 쉬움

public class Ex3_DigitsDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//예외 처리
		//만약에 예외가 발생하면 
		try {
			//1. 예외가 발생할 수 있는 실행문
			System.out.print("수 입력");
			//예외 => NumberFormatException 발생할 수도 있다.
			int num = Integer.parseInt(sc.nextLine());
			//2. 일반 실행문
			System.out.println("입력값 =>"+num);
			
		} catch (Exception e) {
			// 여기에 예외가 발생하면 처리할 실행문
			System.out.println("오직 숫자만 입력하세요.");
		}
		
		
//		System.out.print("수 입력");
//		//예외 => NumberFormatException 발생할 수도 있다.
//		int num = Integer.parseInt(sc.nextLine());
//		System.out.println("입력값 =>"+num);
	}
}
