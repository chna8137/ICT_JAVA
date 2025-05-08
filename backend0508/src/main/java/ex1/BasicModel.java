package ex1;

// JSP에서 VO를 받아서 비지니스 로직을 수행한 후 다시 돌려주는 기능
public class BasicModel implements BasicModelInter{

	private static BasicModel model;

	public BasicModel() {

	}

	public synchronized static BasicModel getModel() {
		if (model == null) {
			model = new BasicModel();
		}
		return model;
	}

	@Override
	public BasicVO changeData(BasicVO v) {
		System.out.println("IP : " + v.getReip());
		if(v.getR1().equals("yes")) {
			v.setReip("192.168.0.11");
		} else {
			v.setReip("211.111.3.21");
		}
		return v;
	}

	
}
