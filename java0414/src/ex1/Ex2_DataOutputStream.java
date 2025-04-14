package ex1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 데이터의 자료형까지 내보내는 2차 스트림이면서, 바이트 스트림!
// 네이워크 통신에서 가끔씩 사용한다. 이해기반!
public class Ex2_DataOutputStream {

	private String path;

	public Ex2_DataOutputStream() {
		path = "src/ex1/dataObj.txt";
	}

	// DataOutPutStream =?
	// *DataType(자료형)과 함께 입력을 처리하는 클래스
	public void dataWrite() {

		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(path));) {
			// 입력 순서가 매우 중요!
			// DataInputStream으로 읽어 들일 경우 순서를 알아야 한다.
			dos.writeInt(10);
			dos.writeBoolean(true);
			dos.writeChar('A');
			dos.writeFloat(10.5F);
			dos.writeUTF("MyTest"); // String
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void dataReader() {
		try (DataInputStream dis = new DataInputStream(new FileInputStream(path));) {
			// DataInputStream으로 읽어 들일경우 순서를 알아야 한다.
			System.out.println("출력 : ---------------------");
			// 자료형의 순서에 맞게 해당 메서드를 출력
			System.out.println("Int : " + dis.readInt());
			System.out.println("Boolean : " + dis.readBoolean());
			System.out.println("Char : " + dis.readChar());
			System.out.println("Float : " + dis.readFloat());
			System.out.println("UTF : " + dis.readUTF());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Ex2_DataOutputStream ref = new Ex2_DataOutputStream();
//		ref.dataWrite();
		ref.dataReader();

	}

}