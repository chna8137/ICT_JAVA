package ex3_auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Ex1_AutoWired {
	
	@Autowired
	@Qualifier("ictMsg1")
	private String msg;

//	@Autowired
//	public void setMsg(String msg) {
//		this.msg = msg;
//	}

	public String getMessage() {
		StringBuffer sb = new StringBuffer();
		sb.append("<p style='color:blue'>");
		sb.append(msg.charAt(0)).append(", ");
		sb.append(msg);
		sb.append("</p>");
		return sb.toString();
	}
}
