package ex1;

public class Ex2_NamingVariable {

	public static void main(String[] args) {
		// sysout ctrl + space
		// 변수의 이름을 만들때 다향한 형식
		// <자료형> 변수명;
		boolean aBcD; // 가능은 하지만 권장사항 위배
		byte 가나다; // 왜 쓰는지 모르겠다.(X)
		short _abcd; // _변수 : 변수의 형태만 존재 시켜야 할 때
		char $ab_cd; // 권장 사항 아님
		// int 3abcd; //불가능 - 숫자는 제일 앞에 올 수 없다.
		long abcd3;
		// float int; //불가능 - 자바에서 사용하는 키워드
		double main; // 가능 - 메서드 이름과 변수이름은 동일해도 무관
		// int my Work; //불가능 스페이스 특수키가 포함
		String myClassName;
		int ABC; // 가능은 하지만 권고사항 위배(상수 일때)
		// 상수이름
		final double PI;
		final int MY_DATA;
		final float myData; // 가능은 하지만 권고사항 위배
	}
}
