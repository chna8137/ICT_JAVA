package ex1;
//while문법)
//초기식
//while(조건식){
//실행문;
//증감식;
//}
// 0 ~ 9까지 출력
public class Ex1_While {
public static void main(String[] args) {
	//0 ~ 9까지 출력 for문으로 출력하시오.
	// for(초기식; 조건식; 증감식){}
	for (int i = 0; i < 10; i++) {
		System.out.println(i);
	}
	System.out.println("While");
	int i = 0; //초기식
	while(i < 10) {
		System.out.println(i); //실행문;
		i++;//증감식;
	}
	System.out.println("========For문으로  홀/짝 완성해보기=============");
	// 0 ~ 10
	for (i = 0; i < 10; i++) {
		if(i % 2 != 0) {
			System.out.println("홀수:"+i);
		}else {
			System.out.println("짝수:"+i);
		}
	}
	System.out.println("========while문으로 완성해보기 변수는 j =============");
	
	int j = 0; //초기식
	while(j<10) { // 조건식
		if(j % 2 != 0) { //실행문
			System.out.println("홀수:"+j);
		}else {
			System.out.println("짝수:"+j);
		}
		j++; // 증감식 
	}	
	
	
}
}



