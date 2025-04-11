package ex1;

public class Ex2_ForIF {
public static void main(String[] args) {
	// 1~ 10까지 세로로 출력 
	// 1-홀
	// 2-짝
	// ......
	for(int i=1; i<11; i++) {
		//System.out.println(i);
		if (i % 2 == 0) {
			System.out.println(i +"짝");
		} else {
			System.out.println(i +"홀");
		}
	}
	System.out.println("----------------");
	int n = 9; // 1 , 2 
	if (n % 2 == 0) {
		System.out.println(n +"짝");
	} else {
		System.out.println(n +"홀");
	}
}
}
