package exam;

public class Exam1 {
public static void main(String[] args) {
	System.out.println("---------- jdk 14 버전으로 변경하시오.");
	String job = "부장";
	String msg = switch (job) {
	case "부장" -> job+"님 어서 오세요.";
	case "과장" -> job+"님 반갑습니다.";
	default -> "어서와요!";
	};
	System.out.println(msg);
}
}
