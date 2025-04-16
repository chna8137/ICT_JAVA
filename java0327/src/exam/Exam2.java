package exam;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("grade를 입력(A,B..) =>");
		// A,B... 입력
		char grade = sc.nextLine().charAt(0);
		System.out.println(grade);
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println(grade+"는 우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println(grade+"는 일반 회원입니다.");
			break;
		default:
			System.out.println(grade+"는 손님 입니다.");
			break;
		}
		switch(grade) {
		case 'A','a' -> System.out.println(grade+"는 우수 회원입니다.");
		case 'B','b' -> System.out.println(grade+"는 우수 회원입니다.");
		default -> System.out.println(grade+"는 손님 입니다.");
		}
	}
}
