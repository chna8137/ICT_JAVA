package demo2;
// 메서드의 문법 메뉴얼 
public class MethodManual01 {

	//https://cafe.naver.com/ictpasswordai/48
	//1.매개변수가 없고 , 반환 값이 없는 메서드 - void
	// 호출 후 변수에 저장X,출력x
	public void test() {
		int num=10;
		String name = "테스형";
		System.out.println(name+"메서드 호출1");
	}
	//-----------------------------------------------
	//2. 매개변수가 있고, 반환 값이 없는 메서드 - void
	//매개변수 : 호출할때 메서드실행문에 필요한 값을 전달 하는 방법
	public void test1(int num,String name) {
		System.out.println("번호 :"+num);
		System.out.println("이름 :"+name);
	}
	//3. 반환값이 있는 메서드를 정의하기 - 기본메서드 ()
	// 호출시 void가 아니기때문에 변수에 저장, 출력문에 적용
	// 자료형 변수 = 참조변수.메서드호출();
	// ex) int res = ref.test2(); 
	// step1) int res;
	// step2)  ref.test2()호출 300으 돌려받는다.
	// step3)  res = 300;
	public int test2() {
		int num = 100;
		int res = num * 3;
		return res;
	}
	//4. 매개변수가 있고, 반환 값이 있는 메서드 
	public int test3(int cnt,String icon) {
		int sum = 0;
		for(int i=0; i<cnt; i++) {
			System.out.println(i+":"+icon);
			sum += i;
			icon +="^^";
		}
		return sum;
	}
	
	public static void main(String[] args) {
		MethodManual01 ref = new MethodManual01();
		//1번 메서드 호출
		ref.test();
		//String msg ="test";
		//System.out.println(msg.charAt(0));
		// 호출 후 변수에 저장X,출력x
		//System.out.println(ref.test());
		//--------------------------------
		System.out.println("2번----------------");
		ref.test1(1,"테스형");
		ref.test1(2,"엑스맨");
		System.out.println("3번----------------");
		int res = ref.test2();
		System.out.println(res+":"+ref.test2());
		System.out.println("4번----------------");
		//public int test3(int cnt,String icon) 
		res = ref.test3(10,"★");
		System.out.println("res ->"+res);
	}

}




