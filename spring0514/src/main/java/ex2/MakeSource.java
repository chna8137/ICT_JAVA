package ex2;

// MySource ��ü�� �������� ���ؼ� DI �޾Ƽ� ����ϴ� ��ü
// MakeSource(��) ---����---> MySource(��)
// MakeSource�� MySource�� �������� ���ؼ� ���� �޾ƾ� �Ѵٸ�,
// ����ʵ�� setter �Ǵ� �����ڰ� �ʿ��ϴ�.
// �ʿ�� �ϴ� �� ����ʵ忡�� setter �Ǵ� �����ڰ� �ʿ��ϴ�.
public class MakeSource {
	// ��Ī property�� ����Ѵ�.
	private MySource source;

	public void setSource(MySource source) {
		this.source = source;
		System.out.println("MakeSource Setter �ּҰ� => " + source);
	}
	
	// MySource���� �����ϴ� �޼��带 ȣ���� �޼���
	public String result() {
		System.out.println(source.reTrunSource());
		return source.reTrunSource();
	}
	

}
