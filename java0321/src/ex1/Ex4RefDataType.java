package ex1;
//String ->클래스 ,대문자로 시작하는 자료형을 참조자료형!
public class Ex4RefDataType {

	public static void main(String[] args) {
		// 한문자를 저장할 자료형을 char 선언 하고 값을 초기화 할때는 " " (x)
		// ''감싸서 한문자를 변수에 저장 
		char m1 = '안';
		char m2 = '녕';
		System.out.println(m1+""+m2);
		// 참조자료형인 String을 사용할 때는 ""를 감싸서 표현한다.
		String msg;
		//시퀀스 데이터: 순서가 있는 데이터를 의미한다.
		//보통 첫번째 index가 0부터 출발한다.
		//안-0, 녕-1 .........
		msg = "안녕하세요";
		
		System.out.println(msg.charAt(0));//안
		System.out.println(msg.charAt(2));//하
		System.out.println("-----------------------");
		
		//문자형 자료형을 선언 하고 값을 초기화 할때는 " " (x)
		// ''감싸서 한문자를 변수에 저장 
		char ch = 'A';
		System.out.println(ch);
		// String 클래스에서 제공해주는 charAt()메서드를 한번 사용해보겠다.
		// msg.charAt(index)호출하면 반환해주는 값의 자료형 char
		// 니까 결국 char형 변수에 저장이 가능하다. *****
		char res = msg.charAt(3); //msg.charAt(1);
		System.out.println(res);//세
		
		System.out.println("-----------------");
		
		char ch2 = "A만나서반가워요".charAt(0);
		System.out.println(ch2);//A
		
		
	}
}




