package ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1_FileReader_Writer {

	private String path;

	public Ex1_FileReader_Writer() {
		path = "src/ex1/demo1.txt";
	}

	// msg를 입력받아서 path에 지정된 파일에 내용을 작성하는 메서드
	public void msgWriter(String msg) {
		// FileWriter : 파일 장치에 연결되는 문자 스트림, 1차 스트림, true : append mode
		// BufferedWriter : 버퍼 기능을 갖춘 문자스트림, 2차 스트림
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));) {
			bw.write(msg); // 문자열을 한 번에 파일로 작성하는 메서드
			bw.newLine(); // 개행을 시켜주는 메서드
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// path에 읽어들이는 메서드
	public String msgReader() {
		try (BufferedReader br = new BufferedReader(new FileReader(path));) {
			String readV = null;
			// br.readLine() 문자열을 한 줄씩 읽어 오다가 파일의 끝에 도달 했을 때는 null이기 때문에
			// while은 null이 아닐 때까지 한 줄 씩 읽어서 readV에 저장
			String res = "";
			while ((readV = br.readLine()) != null) {
				res += readV + "\n";
			}
			return res;

		} catch (Exception e) {
			e.printStackTrace();
			return "너무나 졸립니다";
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Ex1_FileReader_Writer ref = new Ex1_FileReader_Writer();
		ext: while (true) {
			System.out.print("1 : 작성, 2 : 출력, 3 : 종료");
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				System.out.println("Message : ");
				String msg = sc.nextLine();
				ref.msgWriter(msg);
				break;
			case 2:
				String reMsg = ref.msgReader();
				System.out.println(reMsg);
				break;
			case 3:
				System.out.println("프로그램 종료");
				break ext;
			default:
				break;
			}
		}

	}

}
