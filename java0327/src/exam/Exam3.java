package exam;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int randomNumber = (int) (Math.random() * 100) + 1;
		int money;
		int count;

		for (;;) {
			System.out.print("500원에 5번 기회! 돈을 입력하세요:");
			money = Integer.parseInt(scanner.nextLine());
			if (money % 500 != 0) {
				System.out.println("500원 단위로 돈을 입력해주세요");
				continue;
			}
			System.out.println("당신은 " + money / 100 + "번의 기회가 있습니다");
			count = money / 100;
			break;
		}
		// ------------------------------------------------
		System.out.println("1부터 100사이의 숫자를 맞춰보세요!");
		for (int i = 1; i <= (money / 100); i++) {
			System.out.print(i + "번째 도전:");
			int num = Integer.parseInt(scanner.nextLine());

			if (randomNumber > num) {
				System.out.println(num + "보다 더 큰 숫자를 입력하세요");
				count--;
			} else if (randomNumber < num) {
				System.out.println(num + "보다 더 작은 숫자를 입력하세요");
				count--;
			} else {
				System.out.println(randomNumber + "! 정답입니다. 축하합니다!");
				break;
			}

		}
		if (count == 0)
			System.out.println("당신은 실패하셨습니다");

	}
}
