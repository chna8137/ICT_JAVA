package ex1;
//복합 대입 연산자
//대입 연산자와 다른 연산자를 함께 사용함
public class Ex4_Oper {
public static void main(String[] args) {
	int a = 0;
	//a = a + 10;
	a += 10;
	System.out.println(a); // 10
	// a = a[10] - 5;
	System.out.println("1) a-=5 : "+ (a-=5));
	System.out.println(a);
	System.out.println("2) a*=10 : "+ (a*=10));
	System.out.println(a);
	System.out.println("3) a/=2 : "+ (a/=2));
	System.out.println(a);
	System.out.println("4) a%=2 : "+ (a%=2)); 
	System.out.println(a);
}
}
