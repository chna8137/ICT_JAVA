package ex2;

public class MySource {
	
	private String source;
	// �����ڸ� ����ؼ� Spring���� ���� ���ڿ��� ���ڷ� �޾Ƽ�
	// ����ʵ忡 �����Ѵ�.
	public MySource(String source) {
		this.source = source;
		System.out.println("�����ڸ� ���ؼ� ���� ���� �� : " + source);
	}
	
	public String reTrunSource() {
		StringBuilder sb = new StringBuilder();
		sb.append("DI �ǽ� : ");
		// Spring�� ���ؼ� �����ڷ� ���ڿ��� ������ ����
		// StringBuilder ��ü�� �����ؼ� ��ȯ�Ѵ�.
		sb.append(source);
		return sb.toString();
	}

}
