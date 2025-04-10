package ex1;
import java.util.Scanner;
// 연습문제)
//삼항연산자를 활용해서 요구사항을 구현 해보시오.
//모델 :  score > 90 : A
//   score > 80 : B
//   score => C
//삼항연산자 문법 : // (조건)?(true실행):(false실행)
public class Ex8_OperExam {
	public static void main(String[] args) {
		//code here
		// 참조자료형 참조변수 = new  클래스이름();
		Scanner sc = new Scanner(System.in);
		System.out.print(" 점수 : ");
		int score = Integer.parseInt(sc.nextLine());
		char grade = (score > 90) ? 'A':((score > 80) ? 'B':'C');
		System.out.println("당신의 점수:"+score+", 등급 :"+grade+" 입니다.");
	}
}
