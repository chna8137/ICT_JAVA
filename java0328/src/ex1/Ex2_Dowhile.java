package ex1;
//do~while()문은 while문의 조건과 상관없이 무조건 1번은 실행을 하고
//그 이후는 while문의 조건에 따라서 실행할지 여부를 결정된다.
public class Ex2_Dowhile {
public static void main(String[] args) {
	int i = 1;
	do {
		System.out.println(i);
		i++;
	} while (i < 10);
	System.out.println("종료후에 i =>"+i);
//	while(true) {
//		System.out.println(i);
//		if(i == 11) {
//			break;
//		}
//		i++;
//	}
}
}
