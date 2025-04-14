package ex1;

import java.io.BufferedReader;import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex3_BridgeStream {

	public static void main(String[] args) {
		
		InputStream is = System.in;
//		편하고 빠르게 문자열로 읽어들이고 싶다. : BufferedReader
//		한줄단위로 입력받은 값을 readLine()를 사용해서 입력 받고 싶다.
//		브릿지 스트림을 제공 받아 끼워준다. : InputStreamReader
//		new InputStreamReader(is, “언어지원타입”)
		try (BufferedReader br = new BufferedReader(new InputStreamReader(is))){
			System.out.print("입력 : ");
			String msg = br.readLine();
			System.out.println(msg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
