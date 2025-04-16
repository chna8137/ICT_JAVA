package ex2;

public class Ex6_Break {
	// break는 switch,반복문에서 종료시키는 제어문이다.
public static void main(String[] args) {
	int n = 7;
	for(int i=0; i<10; i++) {
		System.out.println(i);//7
		if(i == n) {
			break;
		}
		System.out.println("*****"+i); // 7은 출력이 안된다.
	}
}
}
