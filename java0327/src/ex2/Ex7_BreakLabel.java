package ex2;

import java.util.Scanner;

public class Ex7_BreakLabel {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//무한 루프 ->while(true) , for(;;)
//	for(;;) {
//		System.out.println("1-홀,2-짝,3-종료=>");
//		int userNum = Integer.parseInt(sc.nextLine());
//		System.out.println("입력한 값 :"+userNum);
//		if(userNum == 3) {
//			System.out.println("종료함");
//			break;
//		}
//	}
//	System.out.println("프로그램 종료!");
	
	exit:for(;;) {
		System.out.println("1-홀,2-짝,3-종료=>");
		int userNum = Integer.parseInt(sc.nextLine());
		switch(userNum) {
		case 1:
			System.out.println("당신은 홀을 입력했군요");
			break;
		case 2:
			System.out.println("당신은 짝을 입력했군요");
			break;
		case 3:
			System.out.println("종료함");
			break exit;
		default:
			System.out.println("메뉴를 확인하세요.");
		}
	}
	System.out.println("프로그램 종료!");
	
	
	
	
	
	
	
}
}
