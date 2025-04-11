package ex1;

public class Ex1_For {
public static void main(String[] args) throws InterruptedException {
	// 0 ~ 9 까지 출력을 하는데 가로 출력하시오
//	System.out.println("0");
//	System.out.println(".....");
//	System.out.println("9");
	// 반복문을 사용해서 쉽고 간단하게 해결 
	//		 for문 실행 순서 
	//		1) int i=0 :초기식 => for문에서 오직 한번만 선언되고 대입 
	//		2) i<10; => i의 현재값과 비교해서 true/false : 조건식
	//		3) System.out.print(i+"\t"); : 실행식
	//		4) i++ : 증감식 => i값은 1로 증가
	//		5) i<9; i=1: 조건식 true 니까
	//		6) System.out.print(i+"\t"); : 실행식
	//		7) ....... i++ 한 값이 10이 되면 조건식 false 니까 for문을 종료
	for(int i=0; i<10; i++) { //for문시작
		Thread.sleep(1000);
		//\t는 탭
		System.out.print(i+" ");
	}// for문 종료
	System.out.println("");
}
}
