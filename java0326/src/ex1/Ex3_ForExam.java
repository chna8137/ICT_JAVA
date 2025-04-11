package ex1;

import java.util.Scanner;

//<요구사항>  제한시간 : 15분까지 
// 변수 : n , m , i(for)
//- N ~ M까지 출력하는 프로그램을 작성하시오. -> for *****
//- 출력은 enter단위로 출력 , 입력 받은 n까지  (X)
//- 입력시 정수만 입력 받도록 처리하기 (X)
//- 항상 N은 M보다 적어야 한다. -> if else 
//UI - 초기값 : 1
//-   종료값 : 10
//결과 ) 1 ~ 10까지 출력 
public class Ex3_ForExam {
	public static void main(String[] args) {
		// 요구사항
		// - N ~ M까지 출력하는 프로그램을 작성하시오. *****
		// - 출력은 enter단위로 출력 , 입력 받은 n까지 
		// - 입력시 정수만 입력 받도록 처리하기 -> try ~ catch문으로 처리할 수 있다.
		// - 항상 N은 M보다 적어야 한다. -> if else
		// UI - 초기값 : 1 -> n
		// - 종료값 : 10 -> m
		// 결과 ) 1 ~ 10 까지 출력
		// Step3 : Scanner
		Scanner sc = new Scanner(System.in);
		
		
		
		try {
			System.out.print("초기값 :");
			int n = Integer.parseInt(sc.nextLine());
			System.out.print("종료값 :");
			int m = Integer.parseInt(sc.nextLine());
			// 제어 => "N은 M보다 적어야 한다" -> for문은 실행하고
			// 아니면 "n은 m 보다 클수 없습니다. ->
			// Step 1) : 제어문으로 n < m 클때와 적을 때를 제어한다.
//					if (n < m) {
//						System.out.println("for문실행");
//					} else {
//						System.out.println(n + "은 " + m + " 보다 클수 없습니다.");
//					}

			//수업 핵심
			// Step 2) : 제어문으로 n < m 클때와 적을 때를 제어한후 for문을 요구사항에 맞게 적용
			if (n < m) {
				System.out.println("for문실행");
				for (int i = n; i <= m; i++) {
					System.out.println(i);
				}
			} else {
				System.out.println(n + "은 " + m + " 보다 클수 없습니다.");
			}
		} catch (Exception e) {
			System.out.println("오직 숫자만 입력하세요.");
		}
		

	}
}
