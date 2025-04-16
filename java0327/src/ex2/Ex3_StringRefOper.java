package ex2;

// "" => 문자열 , String 이란 자료형
public class Ex3_StringRefOper {
	// switch, if 문자열 비교 부분만 다시 확인,
	public static void main(String[] args) {
		// test1();
		 test2();
		// String 클래스 테스트 해보기
		String msg = "Test";
		String msg1 = "Test";
		System.out.println(msg == "Test");//true
		if(msg == "Test") {
			System.out.println(msg+"는 같다.");
		}else {
			System.out.println(msg+"는 다르다.");
		}
		
		System.out.println("---------------------");
	}

	private static void test2() {
		// String 클래스의 객체 생성방법
		// 클래스는 설계 도면이고 객체는 설계도면 기준으로 올린 건물 등
		// 명시적 , 묵시적
		// 예) Scanner[참조자료형] sc[참조변수] = new[명시적객체생성] Scanner(매개변수들)[클래스호출];
		// String msg = new String("Test");
		// print(msg) -> Test
		// String msg ="Test"; -> Test
		// 명시적
		String msg = new String("Test");
		String msg1 = new String("Test");
		//-------------------------------------------
		System.out.println("msg 주소1: 0x" + 
		Integer.toHexString(System.identityHashCode(msg)));
		System.out.println("msg 주소2: 0x" + 
		Integer.toHexString(System.identityHashCode(msg1)));
		
		// String 객체 안에 내용비교 즉,"Test"란 문자열을 비교해주는 메서드
		System.out.println("equals =>"+msg.equals(msg1));
		System.out.println("equals =>"+msg.equals("Test"));
		
		System.out.println(msg == msg1); // false
		// msg1.charAt(0)

		// 묵시적 - 내용이 같으면 "Test2"란 값을 가지는 객체는
		// 한번만 생성이되고 그 이후부터는 "Test2"객체를 묵시적으로 생성하려면
		// 기존의 주소를 공유한다.
		String msg2 = "Test2";
		String msg3 = "Test2";
		System.out.println(msg2 == msg3); // true
		// msg3.charAt(0)
		"Test2".charAt(0);
	}

	private static void test1() {
		// == 연산자 =>
		int num1 = 10;
		int num2 = 10;
		System.out.println(num1 == num2); // true
		System.out.println("일반 자료형 비교 --switch문");
		switch (num1) {
		case 10:
			System.out.println("10이면 같다.");
			break;
		default:
			System.out.println("같지 않다.");
		}
		System.out.println("일반 자료형 비교 -- if문");
		if (num1 == 10) {
			System.out.println("10이면 같다.");
		} else {
			System.out.println("같지 않다.");
		}
	}
}
