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

public class BoardUpAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		BoardVO vo = new BoardVO();

		try {
			// BeanUtils.populate : vo에 파라미터 값을 자동으로 넣어줌
			BeanUtils.populate(vo, request.getParameterMap());
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BoardDaoInter dao = BoardDaoImple.getDao();
		dao.updateBoard(vo);
		
		return new ActionForward("myict.ict?cmd=blist", true);
	}

}
