package ex2;
//int n = (int)(Math.random()*갯수)+시작숫자)
public class Ex1_Switch {
public static void main(String[] args) {
	// 출근 시간이 8 ~ 11
	// 범위 ===================
	// 8시 출근합니다.
	// 9시 회의 합니다.
	// 10시 업무를 봅니다.
	// 11시 파견을 나갑니다.	 
	// 간단하게 적용 
	//for(int i=0; i<10; i++) {
	
		int times = (int) ((Math.random()*4)+8); // 8 ~ 11난수를 생성
		System.out.println("[현재 시간:"+times+"시]");
	//}
/*
		 * switch(조건){
		 * case 값1:
		 * 		실행문;
		 *     break;
		 * case 값2:
		 * 		실행문;
		 *     break;
		 * default :
		 *      실행문;     
		 * }
*/
		switch(times) {
		case 8 :
			System.out.println(" 8시 출근합니다. ");
			break;
		case 9 :
			System.out.println(" 9시 회의 합니다.");
			break;
		case 10 :
			System.out.println(" 10시 업무를 봅니다. ");
			break;
		case 11 :
			System.out.println(" 11시 파견을 나갑니다. ");
			break;
		default:
			System.out.println("업무가 없습니다.");
		}
		System.out.println("------------------------");
		// break가 없을 때는 조건에 맞는 다음 case문까지 모두 실행을 한다. *****
		switch(times) {
		case 8 :
			System.out.println(" 8시 출근합니다. ");
		case 9 :
			System.out.println(" 9시 회의 합니다.");
		case 10 :
			System.out.println(" 10시 업무를 봅니다. ");
		case 11 :
			System.out.println(" 11시 파견을 나갑니다. ");
		default:
			System.out.println("업무가 없습니다.(퇴근)");
		}
		
}
}
