package exam;

import java.util.Scanner;

public class Exam4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//무한 루프
		int total = 0;
		int win =0;
		ext:for(;;) {
			System.out.print("1-홀,2-짝,3-종료:");
			int userNum = Integer.parseInt(sc.nextLine());
			// 1,2
			int cpuNum = (int) (Math.random()*2+1);
			//System.out.println(cpuNum);
			// switch안에 case에 명시한 break문은 오직 switch만 종료 시킨다.
			switch (userNum) {
			case 1 ->{
				if(userNum == cpuNum) {//1 - 이겼을때 실행 
					System.out.println("You:1, Cpu:1 => Win!");
					win +=1;
				}else {
					System.out.println("You:1, Cpu:2 => Lose!");
				}
				total += 1;
				}
			case 2->{
				if(userNum == cpuNum) {//2 - 이겼을때 실행 
					System.out.println("You:2, Cpu:2 => Win!");
					win +=1;
				}else {
					System.out.println("You:2, Cpu:1 => Lose!");
				}
				total += 1;
			 }
			case 3 ->{
				System.out.println("종료 합니다.");
				System.out.println("지금까지 Total"+total+" 게임중에 "+win+" 이겼습니다.");
				break ext; 
			}
			default ->
				System.out.println("메뉴에 없습니다.");
				
			}
		}
	}
}
