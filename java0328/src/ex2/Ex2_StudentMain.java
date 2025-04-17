package ex2;
//Ex2클래스를 생성하고 , 속성에 값을 부여한 후 출력을 해보자.
//<참조자료형> <변수> = new <참조자료형과같은클래스>(); 생성하기위해서 호출!
public class Ex2_StudentMain {
public static void main(String[] args) {
	// Ex2_Student 클래스를 객체로 생성 
	//Ex2_Student ref = new Ex2_Student();
	Ex2_Student ref = new Ex2_Student();
	int age = 10; //지역변수
	System.out.println("지역변수 age:"+age);//10
	System.out.println("참조변수 age:"+ref.age);//100
	//<클래스[자원]>.자원 - static 
	//생성된 자원<객체>에 . 연산자를 접근가능한 속성에 값을 대입
	ref.num=1;
	ref.age=22;
	ref.name="테스형";
	//생성된 객체에 . 연산자를 사용해서 접근가능한 값을 출력
	System.out.println(ref.num);//1
	System.out.println(ref.name);//테스형
	System.out.println(ref.age);// 22
}
}
