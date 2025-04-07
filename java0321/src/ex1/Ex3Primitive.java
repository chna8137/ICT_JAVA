package ex1;

public class Ex3Primitive {

	public static void main(String[] args) {
		// 1 byte 즉 8bit : -128 ~ 127 범위
		// 테스트 값 200 일경우 byte d = (byte) 200; //정상적인 값이 안나온다.
		// 또 당연히 -128 ~ 127 범위 넘어 서면 byte에 저장 할 수 없다.
		byte d =  100;
		// println(d); 실행되는 순간 모두 문자열로 변경이 된다. ******
		System.out.println(d); // 100
		
		byte e = 10;
		// 캐스팅 or 디모션 : 큰자료형의 데이터를 작은 자료형으로 변환 한다.
		// 4바이트 이하의 연산은 JVM연산 시 4byte로 승격시켜 놓기 때문에 여기서는 int 형
		// byte형의 자료형의 범위를 넘어서는 값이라면 오버플로어가 발생해서 정확한 값이 안나온다
		//byte res1 = (byte) (d + e);
		int res1 = d + e;
//		System.out.print("캐스팅 결과 =>");
//		System.out.println(res1); // "캐스팅 결과 =>  110"
		System.out.println("캐스팅 결과 =>"+res1);
		
		// 한번 해보기
		// short 자료형 변수 c1,c2를 각각 선언해서 특정 값을 저장 하고 , 더하기 연산을 수행한 후
		// 그 값을 short형 변수 c_res1 에 저장한 후 출력하시오.
		short c1 = 50;
		short c2 = 50;
		short c_res1 = (short) (c1 + c2); // 캐스팅
		int c_res2 = c1 + c2; // int형에 담아서 사용
		System.out.println("c_res1:" + c_res1);
		System.out.println("c_res2:" + c_res2);
		System.out.println("-----------Long Type-------------");
		// Long Type 8byte , 64bit
		// int type 4byte, 32bit 범위 넘겨보기
		//int l_num = 10000000000; //범위가 넘어섬 - 백억 
		// L,l 리터럴 접미사를 부여한다.
		//long l_num = 10L;
		// 정수형 상수값에 L을 붙이면 Long Type 8byte , 64bit 이 된다.
		long l_num = 10000000000L;
		// 캐스팅이 된다.(100에다가 L 붙이는 순간 8바이트에 기억이됨)
		// 4바이트에 저장하려고 하니까 캐스팅을 해줘야 함.
		int int_num = (int)100L;
		// 시스템의 표준 시간대를 초단위로 돌려주는 함수를 사용해서 
		// 그 값을 변수에 저장해보자.
		// System.currentTimeMillis() :현재 초단위의 값을 정수로 돌려준다.
		System.out.println("값 확인 =>"+System.currentTimeMillis());
		// System.currentTimeMillis() -> 1742527381234 
		//int time1 = 1742527381234;
		System.out.println("currentTimeMillis 출력");
		// 
		int times1 = (int) System.currentTimeMillis(); //강제로 넣었지만 올바른 값이 안나옴
		System.out.println("int형으로 받은 Times값 :" + times1);
		// long으로 반환 해주는 함수의 값은 반드시 특별한 경우를 제외하고 long으로 저장해야 한다.
		long times2 = System.currentTimeMillis();
		System.out.println("long형으로 받은 Times값 :" + times2);
		//(byte, short), int , long
	}
}






