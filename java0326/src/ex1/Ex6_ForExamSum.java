package ex1;
//1 ~ n(10)까지의 합을 구하시오.
public class Ex6_ForExamSum {
public static void main(String[] args) {
	//몇개의 변수가 필요 할까요? - noSCanner버전 
	// n , 값을 누적할 변수 sum이 필요하다
	int n = 10; // 사용자에게 받을 변수 
	int sum = 0; //누적시킬 변수
	for(int i=1; i<=n; i++) {
		//System.out.println(i); //1 ~ 10 반복하는지 검수를 해본다.
		//sum = sum + i;
		sum += i;
		//System.out.println(sum +"+"+ i +"="+sum);
	}
	System.out.println(sum);
}
}
