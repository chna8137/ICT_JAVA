package ex2;

import java.util.Scanner;

public class Ex1_ElseIF {
public static void main(String[] args) {
	//https://cafe.naver.com/ictpasswordai/9
	// if else 문을 작성해보기 
	Scanner sc = new Scanner(System.in);
	//int age = 9;
	System.out.print("나이 :");
	int age = Integer.parseInt(sc.nextLine());
	if (age >=8) {
		System.out.println("학교에 다님");
	} else {
		System.out.println("학교에 안 다님");
	}
}
}

