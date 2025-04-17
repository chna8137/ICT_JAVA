package ex2;

public class Ex3_StudentsMain {
public static void main(String[] args) {
	//Ex2_Student 생성하고
	//각속성에 학생의 정보를 저장 한 후 출력 <반복문을 적용 - 배열, 컬랙션>
	Ex2_Student ref1 = new Ex2_Student();
	ref1.num=1;
	ref1.age=22;
	ref1.name="테스형";
	System.out.println("학생번호 : "+ref1.num);
	System.out.println("학생이름 : "+ref1.name);
	System.out.println("학생나이 : "+ref1.age);
	System.out.println(ref1);
	System.out.println("==========================");
	//ref1.num = 2;
	//ref1.name ="하하맨";
	//이시점에서 테스형과 하하맨을 출력하고 싶다면?
	//테스형은 안된다.
	//이해 완료 -> 해결 방법은 새로운 객체를 생성해서 두번째 사용자의 정보를 대입
	// 새로운 학생 -> 액스맨의 정보를 새로운 객체에 생성후 입력 / 출력
	Ex2_Student ref2 = new Ex2_Student();
	//객체에 속성의 값을 찾아가서 set한다.
	ref2.num=2;
	ref2.age=23;
	ref2.name="액스맨";
	// 객체에 속성의 값을 찾아가서 가져온다.(get)
	int num = ref2.num;
	String name = ref2.name;
	System.out.println("학생번호 : "+num);
	System.out.println("학생이름 : "+name);
	System.out.println("학생나이 : "+ref2.age);
	System.out.println(ref2);
	System.out.println("==========================");
	System.out.println(ref1 == ref2); 
	//Integer.toHexString(System.identityHashCode(참조변수));
	System.out.println("==========================");
	// 테스형 , 하하맨을 동시에 표현 할 수 있다.
	System.out.println("학생 ["+ref1.num+"]번의 이름은 ["+ref1.name+"]입니다.");
	System.out.println("학생 ["+num+"]번의 이름은 ["+name+"]입니다.");
	
}
}
