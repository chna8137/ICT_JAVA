package ex1;
//현재 byte관련 수업 - 개념만 이해 *****
public class Ex1Byte {
public static void main(String[] args) {
	/* 여러줄 주석 - 
	 * 주석 : 프로그램의 실행과는 무관한 표기
	 * 
	 * 0과 1의 표현- 2진수
		컴퓨터는 0과 1로 자료를 표현한다. 
		따라서 숫자나 문자도 0과 1의 조합으로 표현된다. 
		
		<Wrapper Class> : 일반 자료형을 클래스로 제공 
		- 클래스(속성,기능) + 일반자료형까지 포함
		
		Integer 클래스 : int형과 관련된 공구박스 
		중에서 10진수를 2진수로 변경해주는 메서드를 사용
		=> toBinaryString(10) -> 2진수로 반환 
		String 클래스  : 문자열과 관련된 공구박스	
	 * */
	System.out.println("0 의 2진수 :"+Integer.toBinaryString(0));
	System.out.println("1 의 2진수 :"+Integer.toBinaryString(1));
	System.out.println("2 의 2진수 :"+Integer.toBinaryString(2));
	System.out.println("3 의 2진수 :"+Integer.toBinaryString(3));
	System.out.println("4 의 2진수 :"+Integer.toBinaryString(4));
	System.out.println("5 의 2진수 :"+Integer.toBinaryString(5));
}
}
