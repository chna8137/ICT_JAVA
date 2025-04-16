package ex1;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//step1() 메서드를 호출해서 사용해보기
		//step2();
		//step3() 메서드를 사용해서 입력값을 전달해보기
		
		try {
			System.out.print("Dan =>");
			int dan = Integer.parseInt(sc.nextLine());
			System.out.print("범위를 입력해 주세요(1,3,5,7,9):");
			int limit = Integer.parseInt(sc.nextLine());
			if (limit < 1 || limit % 2 == 0 || limit > 9 ) {
				System.out.println("올바른 범위를 입력하세요!");
			} else {
				step3(dan,limit);
			}
		} catch (Exception e) {
			System.out.println("숫자만 입력 하세요!");
		}
		
		

	}

// step1 메서드 정의해보기
	private static void step1() {
		// step1) 기본적인 구구단 만들기
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "x" + i + "=" + (j * i) + "\t");
			}
			System.out.println("");
		}
	}
	
	// step2 ) 타이틀 단을 출력해보자.
	// 추가 반복문을 사용 하지 않고 구현하기 
	private static void step2() {
		// step2) 기본적인 구구단 만들기
		for (int i = 0; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				if (i == 0) {
					System.out.print(j + "단\t");
				} else {
					System.out.print(j + "x" + i + "=" + (j * i) + "\t");
				}
			}
			System.out.println("");
		}
	}	
	
	// step3 ) 입력받은 단값과 범위에 따라 출력하기 
	//step3(입력받을 값의 변수를 선언)
	//step3(int dan,int limit) {} =>호출할때 step3(5,3);
	private static void step3(int dan,int limit) {
		// step2) 기본적인 구구단 만들기
		// 가설 : 단이 5 , 범위가 3일 때 - 항상 단은 중앙에 위치 
		//      4     5    6
		//int dan = 5;
		//int limit = 3;
		int min = dan - (limit/2);
		int max = dan + (limit/2);
		System.out.println(min +"~"+max);
		for (int i = 0; i <= 9; i++) {
			for (int j = min; j <= max; j++) {
				if (i == 0) {
					System.out.print(j + "단\t");
				} else {
					System.out.print(j + "x" + i + "=" + (j * i) + "\t");
				}
			}
			System.out.println("");
		}
	}	
	
	
	
	
	
	
}
