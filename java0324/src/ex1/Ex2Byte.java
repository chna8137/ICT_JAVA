package ex1;
/*
10진수와 16진수
2진수로 표현하면 길이가 길어지므로 8진수나 16진수를 사용하기도 한다.
10이상을 표현 
0 ~ 9까지는 십진수와 동일 , 10 ~ 15까지는 알파벳을 사용 
10 ~ 15  A ~ F 로 표현 

 * */
public class Ex2Byte {
public static void main(String[] args) {
	//9 ~ 16 사이의 정수를 **16진수(헥사, Hex)**로 변환 하는 함수 사용해보기
	//toUpperCase() : 소문자를 대문자로 변경 해주는 기능 
	System.out.println("9의 16진수 :"+Integer.toHexString(9));
	System.out.println("10의 16진수 :"+Integer.toHexString(10).toUpperCase());
    System.out.println("11 의 16진수: " + Integer.toHexString(11).toUpperCase());
    System.out.println("12 의 16진수: " + Integer.toHexString(12).toUpperCase());
    System.out.println("13 의 16진수: " + Integer.toHexString(13).toUpperCase());
    System.out.println("14 의 16진수: " + Integer.toHexString(14).toUpperCase());
    System.out.println("15 의 16진수: " + Integer.toHexString(15).toUpperCase());
    System.out.println("16 의 16진수: " + Integer.toHexString(16).toUpperCase());
    System.out.println("17 의 16진수: " + Integer.toHexString(17).toUpperCase());
    
    System.out.println(100/16); // 몫 6
    System.out.println(100%16); // 나머지 4
    
    System.out.println("100 의 16진수: " + Integer.toHexString(100).toUpperCase()); // 64
    
    //키보드 손놓으시고
    // 252(10진수를)  16진수로 변환 하시오.
    //해답)
    // 252 / 16 
    System.out.println(252 % 16);  //나머지 12
    System.out.println(252 / 16);  //몫 15
    // 출력형태 : 역으로 ~ 즉 몫 , 나머지 형태로 출력 
    // 15-F , 12-C => FC가 출력이 된다.
    System.out.println("252 의 16진수: " + Integer.toHexString(252).toUpperCase());
    // 프로그래밍에서는 16진수를 0x 접두사를 붙여 나타낸다.
    int num = 0x9;
    System.out.println(num);
    
    //Integer.parseInt("문자열정수",진수) -> 문자열 정수를 "10" -> 연산하기 위해서 정수로 변경해주는 함수
    int num2 = Integer.parseInt("252"); // 10진수 
    System.out.println(Integer.toHexString(num2).toUpperCase()); //FC
    int num3 = Integer.parseInt("A",16); // 10
    System.out.println(num3);
    System.out.println("****************");
    System.out.println(0xA);
    System.out.println(0xB);
    System.out.println(0xC);
    System.out.println(0xD);
    System.out.println(0xE);
    System.out.println(0xF);
    //9 ~ 16 사이의 정수를 **16진수(헥사, Hex)**로 변환 하는 함수 사용해보기
    for(int i=9; i <=16; i++) {
    	System.out.println(i+"의 16진수 :"+Integer.toHexString(i).toUpperCase());
    }
}
}
