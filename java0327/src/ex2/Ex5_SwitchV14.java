package ex2;

public class Ex5_SwitchV14 {
public static void main(String[] args) {
	// 90점 이상이면 =>"A학점"
		// 80 => "B학점" ...... 을 변수로 저장
		int num = 95;
		String res;
		switch (num / 10) {
		case 10, 9:
			res = "A학점";
			break;
		case 8:
			res = "B학점";
			break;
		case 7:
			res = "C학점";
			break;
		case 6:
			res = "D학점";
			break;
		default:
			res = "F";
		};
		System.out.println(num + "점수의 학점 =>" + res);
		System.out.println("---------------------------");
		//변수에 switch문의 결과를 바로 저장이 가능하다.
		res = switch(num /10) {
			case 10,9 -> "A학점";
			case 8 -> "B학점";
			case 7 -> "C학점";
			case 6 -> "D학점";
			default -> "F학점";
		};
		System.out.println(num + "점수의 학점 =>" + res);
		//복잡한 로직이 들어가는 경우 블록({})을 쓰고 yield로 값을 반환해줘야 함.
		System.out.println("---------------------------");
		res = switch(num / 10) {
			case 10,9 -> {
					if (num > 95) {
						yield "A+학점";
					} else {
						yield "A학점";
					}
				}
			case 8 -> { yield "B학점";}
			case 7 -> "C학점";
			case 6 -> "D학점";
			default -> "F학점";
		};
		System.out.println(num + "점수의 학점 =>" + res);
		
		
		
		
		
		
		
		
		
		
		
	}
}
