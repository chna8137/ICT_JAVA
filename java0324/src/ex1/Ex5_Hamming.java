package ex1;

public class Ex5_Hamming {
	//ctrl + Shift + f : 코드정렬 
	public static void main(String[] args) {
		// 비교할 문자열 2개를 각각 변수에 저장
		String a = "karolin";
		String b = "kathrin";
		int num1 = a.charAt(2); //'r' 
		int num2 = b.charAt(2); //'t'
		System.out.println("r =>"+num1);
		System.out.println("t =>"+num2);
		System.out.println("2진수 (r): " + Integer.toBinaryString(num1)); // 1110010
        System.out.println("2진수 (t): " + Integer.toBinaryString(num2)); // 1110100
                                                                         // 0000110 => 6이 나와야 한다.
     // XOR 연산 수행
        int xorResult = num1 ^ num2;
        System.out.println(xorResult); // 6
        System.out.println(Integer.toBinaryString(xorResult)); // 6 -> 110
	}
}
