package ex1;
//증감연산자
//전치 : 증가부터 시켜놓고 실행 ++a
//후치 : 실행한 후에 증가 시킴.a++
public class Ex7_Oper {
public static void main(String[] args) {
	int a = 10;
	int b = 10;
	System.out.println("a : "+ (++a)); //11
	System.out.println("b : "+ (b++)); // 10
	System.out.println("b++ : "+ b);// 11
	
	int c = 0;
	System.out.println("c:"+(c++)); //0
	System.out.println("c:"+c); //1
}
}
