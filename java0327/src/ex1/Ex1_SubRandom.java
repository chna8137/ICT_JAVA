package ex1;
//난수에 대해서 알아보자.
//Math : 수학관련 자원을 가지고 있는 클래스
//그중에서 random() : 난수를 발생 
//int n = (int)(Math.random()*갯수)+시작숫자)
public class Ex1_SubRandom {
public static void main(String[] args) {
	
	for(int i=0; i<10; i++) {
	    double rn = Math.random();
		System.out.println(i+"번째 난수 =>"+rn);
		int rn2 = (int) (Math.random()*2)+5;
		System.out.println(i+"번째 난수 =>"+rn2);
		System.out.println("=============================");
	}
}
}
