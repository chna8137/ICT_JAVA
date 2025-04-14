package ex1;

import java.io.Serializable;

// ObjectStream에서 사용될 객체 (Pojo)
public class MemberVO implements Serializable{
	
	// static - network에서는 전송이 안된다.
	
	private int num;
	
	transient private String pass;
	
	private String name;
	
	private boolean agree;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAgree() {
		return agree;
	}

	public void setAgree(boolean agree) {
		this.agree = agree;
	}
	
	

}
