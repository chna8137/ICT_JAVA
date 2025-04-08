package ex1;

public class Ex4_Byte {
public static void main(String[] args) {
	char ch1 = 'k';
	int ch1_num = ch1; // 2 -> 4바이트 (프로모션)
	System.out.println(ch1_num);
	//107(10진수) = 1101011(2진수)
	System.out.println(Integer.toBinaryString(ch1_num)); //1101011
	//x의 이진수 
	//System.out.println(_____________________);
	//120(10진수) = 1111000(2진수)
	//java에서 2진수를 나타내는 접두사 => 'ob'
	//Java 7 이상에서는 2진수를 0b 접두어를 사용하여 표현할 수 있음.
	//0b1101011은 10진수 107과 동일
	System.out.println("----------------------------");
	int num1 = 0b1101011; // 107 (k)
	int num2 = 0b1111000; // 120 (x)
	// xor (^)
	// 1101011
	// 1111000
	// ------------
	// 0010011 (19, 2진수: 10011)
	int xorResult = num1 ^ num2;
	System.out.println(xorResult);
	
}
}
