package ex1;

public class Ex5_Oper {
public static void main(String[] args) {
	int a =10;
	int b=20;
	// 해석
	// 1. ((a+=12) > b) => a+=12 변수 a에는 10+12 = 22가 저장이 되고
	// 22 > b => true 이기 때문에 || 는 앞에서 true이면 뒤는 실행하지 않고
	// true가 된다. 그 true값을 다시 변수 c에 저장한다.
	// 2. 결국 (a==(b+=2)) 의 b+=2는 실행 되지 않기 때문에 b의 값은 그대로
	// 출력된다.
	boolean c = ((a+=12) > b) || (a==(b+=2));
	System.out.println("c= "+c);//true
	System.out.println("a= "+a);//22
	System.out.println("b= "+b);//20
	System.out.println("-------------");
	
	// || 가 더 효율적이다. | 는 조건에 만족하더라도 뒤까지 실행 후 검사 
	a=10;
	b=20;
	boolean c2 = ((a+=12) > b) | (a==(b+=2));
	System.out.println("c2= "+c2);
	System.out.println("a= "+ a);
	System.out.println("b= "+ b);//22
	System.out.println("-------------");
	
	
	
	
	
}
}
