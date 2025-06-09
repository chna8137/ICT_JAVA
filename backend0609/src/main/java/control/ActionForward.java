package control;

public class ActionForward {
	
	public ActionForward() {
		
	}
	private String url; // 모델이 수행한 후 뷰의 경로
	
	private boolean methods; // 이동방식 : redirect => true, forward => false;

	public ActionForward(String url) {
		this.url = url;
	}

	public ActionForward(String url, boolean methods) {
		this.url = url;
		this.methods = methods;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isMethods() {
		return methods;
	}

	public void setMethods(boolean methods) {
		this.methods = methods;
	}
	
	
	
	
}
