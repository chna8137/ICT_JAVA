package ex1;
//삼항연산자 (조건)?(실행식1):(실행식2)
//제어문 if else
//if(조건) { 실행1 } else { 실행2}
public class Ex2_Oper {
public static void main(String[] args) {
	String msg = "ICTPasswordLess";
	System.out.println(msg);
	System.out.println("문자열의 길이(length):"+msg.length());
	// I란 한단어(첫글자)를 char형 변수 cc에 저장
	char cc = msg.charAt(0);
	System.out.println("한문자만 반환하는 메서드 charAt(idx) : " + cc);
	
	// 삼항연산자 (조건)?(True=>실행식1):(False=>실행식2)
	String res = (cc == 'X')? cc +"별":cc+"하트";
	System.out.println(res);
	int res2 = (cc == 'I') ? 100 : 50;
	System.out.println(res2);
	
}
}
