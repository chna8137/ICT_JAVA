package action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import control.ActionForward;
import dao.BoardDaoImple;
import dao.BoardDaoInter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.BoardVO;

// main.ict?cmd=blist
// blist=action.BoardListAction
public class BoardListAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// Dao로부터 데이터를 받아오기 위한 메서드를 호출
		BoardDaoInter bdao = BoardDaoImple.getDao();
		List<BoardVO> blist = bdao.listBoard();
		// forward로 값 전달
		request.setAttribute("blist", blist);
		return new ActionForward("board/boardList", false);
	}

}