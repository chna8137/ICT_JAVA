package ex1;

import java.util.Scanner;

public class Ex1_Oper {
	//사칙연산과 외부 입력처리 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수1 numA:");
		//sc.nextLine() => "10" 
		//Integer.parseInt("10")
		//Integer.parseInt(sc.nextLine());
		int numA = Integer.parseInt(sc.nextLine());
		System.out.print("수2 numB:");
		int numB = Integer.parseInt(sc.nextLine());
		
		int resNum1 = numA + numB;
		int resNum2 = numA - numB;
		int resNum3 = numA * numB;
		int resNum4 = numA / numB;
		int resNum5 = numA % numB;
		System.out.println(numA+" + "+numB+" = "+ resNum1);
		System.out.println(numA+" - "+numB+" = "+ resNum2);
		System.out.println(numA+" * "+numB+" = "+ resNum3);
		System.out.println(numA+" / "+numB+" = "+ resNum4);
		System.out.println(numA+" % "+numB+" = "+ resNum5);
	}
}
