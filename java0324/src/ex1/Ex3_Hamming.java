package ex1;

public class Ex3_Hamming {
public static void main(String[] args) {
	//비교할 문자열 2개를 각각 변수에 저장
	String a = "karolin";
    String b = "kathrin";
    // 해밍 거리가 작을수록 문자열이 더 유사한 의미를 가짐.
    // 정수형 변수 count에 0으로 초기화 한다.(지역)
    int count = 0;
    //String => 한문자를 가져오는 메서드 ? a.charAt(idx), b.charAt(idx)
    //거리를 구하는 조건 : 문자열의 길이가 같아야 한다.
    //String => 문자열의 길으를 정수로 반환 => a.length() , b.length()
    // 길이가 7이니까 index는 0 ~ 6까지이다.
    System.out.println(a.length() +":"+b.length());
    System.out.println(a.charAt(0) +":"+ b.charAt(0)); // 첫번째 index를 출력한다.
    System.out.println(a.charAt(0) +":"+b.charAt(0)+"="+(a.charAt(0) ^ b.charAt(0)));
    System.out.println(a.charAt(1) +":"+b.charAt(1)+"="+(a.charAt(1) ^ b.charAt(1)));
    System.out.println(a.charAt(2) +":"+b.charAt(2)+"="+(a.charAt(2) ^ b.charAt(2)));
    //count를 1증가한다.
    count = count + 1;
    System.out.println(a.charAt(3) +":"+b.charAt(3)+"="+(a.charAt(3) ^ b.charAt(3)));
    count = count + 1;
    System.out.println(a.charAt(4) +":"+b.charAt(4)+"="+(a.charAt(4) ^ b.charAt(4)));
    count = count + 1;
    System.out.println(a.charAt(5) +":"+b.charAt(5)+"="+(a.charAt(5) ^ b.charAt(5)));
    System.out.println(a.charAt(6) +":"+b.charAt(6)+"="+(a.charAt(6) ^ b.charAt(6)));
    System.out.println("0이 아닌 갯수는 몇개인가?"+count);
}

}
