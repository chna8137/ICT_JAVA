package ex1;

public class Ex2_MyProfile {
	private String name;
	private int age;
	private String addr;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String printProfile() {
		return name + ":" + age + ":" + addr;
	}
}