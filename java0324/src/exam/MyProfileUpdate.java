package exam;

import java.util.Scanner;

//한번 해보기
public class MyProfileUpdate {
public static void main(String[] args) {
	
	//String name = "테스형"; //이름 입력하세요=>
	//String age = "20"; // 나이를 입력하세요 =>
	//String addr = "서울시 강남구"; //주소를 입력 =>
	
	//출력
	//당신의 성은 [테] 이름은 [스형] 입니다.
	//나이는 [20]세이고 , 이름은 총 [3]글자 입니다.
	//사는곳은 [서울시 강남구] 이군요
	
	//1. Scanner 생성하기 
	//2. 사용자 UI만들기 
	//System.out.print("첫번째 메세지:");
	//3. 입력값을 문자열 변수에 저장 후 
	// 출력하기
	Scanner sc = new Scanner(System.in);
	System.out.print("이름 입력하세요=>");
	//String name ="테스형";
	String name = sc.nextLine();
    System.out.print("나이를 입력하세요 =>");
    //int age = "20"; // 10,20
    //String age = sc.nextLine(); //=> "20"
    
    int age = Integer.parseInt(sc.nextLine());
//    String ageStr = sc.nextLine();
//    int age;
//    age  = Integer.parseInt(ageStr);
    System.out.print("성 ->"+name.charAt(0));//0->성
    System.out.println(", 이름 ->"+name.substring(1));//1부터
    System.out.println("산수 :"+(age >= 19)); // boolean 결과
//    if(true|false) {
//    	
//    }else {
//    	
//    }
    if(age >= 19) {
    	System.out.println("당신은 성인입니다.");
    }else {
    	System.out.println("당신은 미성년입니다.");
    }
	
	
	
	
}
}
