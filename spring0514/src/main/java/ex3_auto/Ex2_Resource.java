package ex3_auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Ex2_Resource {
	
	@Qualifier("myict2")
	// 자동으로 bean이 연결 된다
	@Autowired
	private Ex2_MyResource res;
	
	public Ex2_MyResource getRes() {
		return res;
	}

}
