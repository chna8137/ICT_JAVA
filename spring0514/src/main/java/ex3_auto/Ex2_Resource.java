package ex3_auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Ex2_Resource {
	
	@Qualifier("myict2")
	// �ڵ����� bean�� ���� �ȴ�
	@Autowired
	private Ex2_MyResource res;
	
	public Ex2_MyResource getRes() {
		return res;
	}

}
