package ex1;
//실수형
//3.14 -> 기본 자료형 double 
//정밀도 **
//float - 4byte - 32bit - 정밀도 소수점 7자리
//double - 8byte - 64bit - 정밀도 소수점 15자리 
public class Ex3Primitive4 {
	public static void main(String[] args) {
		// float 선언
		float fnum;
		fnum = (float) 3.14;
		// float 즉 4바이트에 저장하기 위해서는 실수에 반드시 F,f 붙여야 함.
		fnum = 3.14F;
		// double 선언
		double dnum = 3.14;
		System.out.println("float -> "+fnum);
		System.out.println("double -> "+dnum);
		// 적은 자료형 -> 큰 자료형
		double dnum2 = fnum;
		System.out.println(dnum2);
		System.out.println("--- Float , Double의 데이터 정밀도 표현 ---");
		//dnum = 1; // 기존의 3.14는 버리고, 다시 1값을 double자료형 변수에 저장
		dnum = 1;
		//for문안에 지역변수 i를 가지고 0 부터 10000 -1 까지 실행문을 반복실행한다.
		int ii = 10000;
		System.out.println(ii<10000);
		
		for(int i=0; i<10000; i++) {
			dnum = dnum + 0.1;
			//System.out.println(dnum);
			//System.out.println("---------------");
		}
		//1001.000000000159
		System.out.println("결과 =>"+dnum);
		fnum = 1.0F;
		for(int i=0; i<10000; i++) {
			fnum = fnum + 0.1f;
			//System.out.println(dnum);
			//System.out.println("---------------");
		}
		System.out.println("결과 =>"+fnum);
	}
}


