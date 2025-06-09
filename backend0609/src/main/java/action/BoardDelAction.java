package action;

import java.io.IOException;

import control.ActionForward;
import dao.BoardDaoImple;
import dao.BoardDaoInter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.BoardVO;

// bdel=action.BoardDelAction
public class BoardDelAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int num = Integer.parseInt(request.getParameter("num"));
		System.out.println("num => " + num + "이 삭제 처리 됨!");
		
		BoardDaoInter dao = BoardDaoImple.getDao();
		dao.delBoard(num);
		
		return new ActionForward("myict.ict?cmd=blist", true);
	}

}
