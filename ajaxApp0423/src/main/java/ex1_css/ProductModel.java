package ex1_css;

import java.util.ArrayList;
import java.util.List;

public class ProductModel {
	
	private static ProductModel pModel;
	private List<ProductVO> proList;
	private int[] pri;
	public ProductModel() {
		proList = new ArrayList<ProductVO>();
		pri = new int[] {120000, 220000, 320000};
		makeProduct(3);
	}
	
	public synchronized static ProductModel getpModel() {
		if(pModel == null) {
			pModel = new ProductModel();
		}
		return pModel;
	}
	
	private void makeProduct(int num) {
		for(int i = 0; i < num; i++) {
			ProductVO v = new ProductVO();
			v.setNum(i+1);
			v.setPtitle("상품"+(i+1));
			v.setImg("http://192.168.0.24/ajaxApp0423/images/prod"+(i+1) +".jpg");
			v.setPrice(pri[i]);
			v.setPcont("상품" + (i+1) + " : 설명 텍스트");
			proList.add(v);
		}
	}
	
	public List<ProductVO> getProList() {
		return proList;
	}

}
