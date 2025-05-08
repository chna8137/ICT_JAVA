package exam;

import java.util.Arrays;

public class MemoModel implements MemoModelInter {
	
	private static MemoModel model;
	
	private MemoModel() {}
	
	public synchronized static MemoModel getModel() {
		if(model == null) {
			model = new MemoModel();
		}
		return model;
	}

	@Override
	public String printMemo(MemoVO vo) {
		StringBuilder sb = new StringBuilder();
		// 당신이 입력한 글 : 1번 , 제목:하하,작성자:writer,내용:하이,ip:192.111.111.111
		sb.append("당신이 입력한 글 : ");
		sb.append(vo.getNum());
		sb.append(", 제목 : ");
		sb.append(vo.getTitle());
		sb.append(", 작성자 : ");
		sb.append(vo.getWriter());
		sb.append(", 내용 : ");
		sb.append(vo.getContents());
		sb.append(", 선택한 값 : ");
		sb.append(Arrays.toString(vo.getCh1()));
		return sb.toString();
	}

}
