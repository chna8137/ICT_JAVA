package ex2;

import java.util.Scanner;

//다중 if문 X
//if else if else if else
public class Ex3_IFElseIF {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//그룹이 A ~ D까지고 나머지는 흰색
	System.out.print("Group을 입력 [A,B,C,D]=>");
	String gd= sc.nextLine();
	char group = gd.charAt(0);
	//색상을 저장할 변수를 선언
	String color = "";
	if (group == 'A') { //초록색
		color ="초록색";
	} else if(group == 'B'){ //파란색
		color ="파란색";
	}else if(group == 'C'){ //노란색
		color ="노란색";
	}else if(group == 'D'){ //하늘색
		color ="하늘색";
	}else { // 흰색
		color ="흰색";
	}
	System.out.println("당신은 "+group+"그룹이기 때문에 "+color+"입니다.");
}
}
