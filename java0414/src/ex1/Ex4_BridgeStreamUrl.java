package ex1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex4_BridgeStreamUrl {
	
	public static void main(String[] args) throws Exception {
		// Get 방식!
		String urls = "https://ictedu.co.kr/index_new.php?main_page=job_report&place=";
		
		URL url = new URL(urls);
		
		// 받기 위한 스트림 메서드를 찾아야 한다.
		// 메서드의 반환값이 InputStream이다.
		InputStream is = url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		// 여러 줄 일 때 반복문
		String readV = null;
		while((readV = br.readLine()) !=null ) {
			System.out.println(readV);
		}
	}

}
