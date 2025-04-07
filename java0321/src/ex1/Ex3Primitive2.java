package ex1;

public class Ex3Primitive2 {
	
	public static void main(String[] args) {
		System.out.println("-----------char Type-------------");
		// 문자 하나를 저장하려고 할때 사용하는 자료형 
		// char 타입 - 유니코드 : 2byte
		// 오직 하나의 문자를 저장 할 수 있는 타입
		// 'A' ,'가'
		//char var1 ="가나다라";
		//char var2 = '가나';
		//char var22 = "가";
		//char var3 = '나';
		//System.out.println("자바에서 한문자를 저장하기 위한 자료형:char =>");
		//System.out.println(var3);
		// char 타입은 2byte이면서 기본값이 유니코드
		// 표기
		char var1 = '\u0000'; // 기본 값 *****
		System.out.println("char 타입의 초기값 \u0000 => " + var1);
		char var2 = '\u0061'; // -> a란 문자열 
		System.out.println("char 타입의 초기값 \\u0061 => " + var2);
		var2 = '\u0062';
		System.out.println("char 타입의 초기값 \\u0062 => " + var2);
		// 소문자 알파벳 정수값 : a = 97 ~ z = 122
		// 대문자 알파벳 정수값 : A = 65 ~ Z = 90
		char var3 = 97;
		System.out.println(var3); // 97 -> 'a'
		
		// 응용
		// 연산자 -> =(대입) , .(참조)->접근해서 사용 
		char ch1 = 'A';
		short ch2 = 1;
		// 이유는? ch1 + ch2 연산시 int형이기 때문에
		// char 형 변수 즉 2byte에 저장하기 위해서는 (char) 캐스팅을 작성해야 한다.
		char ch3 = (char) (ch1 + ch2);
		System.out.println(ch3); // 66 -> B
		
		
	}
}



