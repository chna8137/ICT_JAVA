package ex1;
/* bit단위로 연산하는 비트 연산자
 * &,|,^
 */
public class Ex6_Oper {
public static void main(String[] args) {
	//가장 오른쪽 자리(1의 자리) = 2의 0승 = 1
	//다음 자리(2의 자리) = 2의 1승 = 2
	//다음 자리(4의 자리) = 2의 2승 = 4
	//다음 자리(8의 자리) = 2의 3승 = 8 이런방법으로 연산이 진행이 됨!
	              // 8 4 2 1
	int a = 10;   // 1 0 1 0
	int b = 7;    // 0 1 1 1
	int c = a & b;// 0 0 1 0 -> 2
	//위의값을 2진수로 각각 출력 해보기 
	System.out.println(Integer.toBinaryString(a));
	System.out.println(Integer.toBinaryString(b));
	System.out.println("a & b ="+c);
	// xor 두 비트중 하나가 1이고 다른 하나는 0
	// 일 경우 연산결과는 1 -> 달라야 1이다. *****
	c = a ^ b;
	// 1 0 1 0
	// 0 1 1 1
	// ---------
	// 1 1 0 1
	System.out.println("a^b 의 결과:" + c);// 13
	// !랑 같은 개념 
	// ~논리부정 1 = > 0
	//         0  => 1
	//c = 1 1 0 1 => ~c = 0 0 1 0
	System.out.println("2진수 c :"+Integer.toBinaryString(~c));
	System.out.println("~c 의 결과:"+(~c)); 
	
	// 쉬프트 연산 : 
	// a : 비트 연산대상이 되는 변수 값 
	// b : 얼마만큼 쉬프트 즉 비트를 이동 시킬 값
	a = 12; //0 0 0 0 1 1 0 0
	b = 2; 
	c = a >> b; //0 0 0 0 0 0 1 1 => 2칸을 >> 방향으로 쉬프트 한 것
	int d = a << b;  //0 0 1 1 0 0 0 0  => 2칸을 << 방향으로 쉬프트 한 것
	// 128  64 32 16 8 4 2 1     
	// 0    0  1  1  0 0 0 0
	System.out.println("12의 2진수 :"+Integer.toBinaryString(a));
	System.out.println("12 >> 2 :"+c);//3
	System.out.println("12 << 2 :"+d);//48
	
	
}
}
