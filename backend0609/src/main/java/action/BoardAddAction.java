package action;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

import control.ActionForward;
import dao.BoardDaoImple;
import dao.BoardDaoInter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.BoardVO;

// badd=action.BoardAddAction
public class BoardAddAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		BoardVO vo = new BoardVO();
//		vo.setSubject(request.getParameter("subject"));
//		vo.setWriter(request.getParameter("writer"));
//		vo.setContents(request.getParameter("contents"));
//		vo.setReip(request.getParameter("reip"));
		try {
			// BeanUtils.populate : vo에 파라미터 값을 자동으로 넣어줌
			BeanUtils.populate(vo, request.getParameterMap());
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BoardDaoInter dao = BoardDaoImple.getDao();
		dao.addBoard(vo);
		return new ActionForward("myict.ict?cmd=blist", true); // redirect
	}

}
