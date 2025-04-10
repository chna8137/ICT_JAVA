package ex1;

public class Ex3_Oper {
public static void main(String[] args) {
	int n1 = 1;
	int n2 = 3;
	int n3 = 2;
	int res = n1 + n2 * n3;
	System.out.println(res); // 7
	// code here : () 우선 순위를 조정
	int res2 = (n1 + n2) * n3;
	System.out.println(res2);//8
}
}
