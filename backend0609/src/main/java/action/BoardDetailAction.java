package action;

import java.io.IOException;

import control.ActionForward;
import dao.BoardDaoImple;
import dao.BoardDaoInter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.BoardVO;

// cmd=bdtail
// bdtail.action.BoardDetailAction
public class BoardDetailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int num = Integer.parseInt(request.getParameter("num"));
		BoardDaoInter dao = BoardDaoImple.getDao();
		BoardVO vo = dao.detailBoard(num);
		request.setAttribute("vo", vo);
		return new ActionForward("board/boardDetail", false);
	}

}
