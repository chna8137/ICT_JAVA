package ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ex5_ObjectStream {
	
	String path = "src/ex1/obj.txt";
	
	public void myWriteObject() {
		// VO를 생성
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));){
			// VO를 생성 후 전달할 값을 저장
			// NotSerializableException 에러
			// 직렬화 대상이 되는 객체는 (Serializable : 차표) 인터페이스를 구현해야 한다.
			MemberVO v = new MemberVO();
			v.setNum(1);
			v.setName("테스형");
			v.setPass("11");
			v.setAgree(true);
			oos.writeObject(v); // 생성한 객체를 스트림을 통해서 전달한다.<직렬화>
			System.out.println("정상적으로 직렬화 성공!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void myReaderObject() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
			MemberVO v = (MemberVO) ois.readObject(); // 역직렬화
			System.out.println("NO : " + v.getNum());
			System.out.println("Name : " + v.getName());
			System.out.println("Pass : " + v.getPass());
			System.out.println("Agree : " + v.isAgree());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Ex5_ObjectStream ref = new Ex5_ObjectStream();
		ref.myWriteObject();
		System.out.println("-------");
		ref.myReaderObject();
	}

}
