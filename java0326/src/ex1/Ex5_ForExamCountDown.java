package ex1;
//10 부터 0(i>=0)까지 1씩 감소(--)하면서 출력
// for적용할 때 - 초기값, 조건값, 증감식 
// 초기값 : 10 부터 
// 조건값 : 0(i>=0)까지
// 증감식 : 감소(--)
// Thread.sleep(1000); -> 1000은 1초 
public class Ex5_ForExamCountDown {
public static void main(String[] args) throws InterruptedException {
	//빈칸을 요구사항에 맞게 완성 해보기 
	//초기식;조건식;증감식
	for(int i=10; i>=0; i--) {
		Thread.sleep(1000);
		System.out.println(i);
	}
}
}
