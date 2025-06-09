package action;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import control.ActionForward;
import dao.MemberDaoImple;
import dao.MemberDaoInter;
import factory.FactoryService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vo.MemberVO;

public class LoginAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String method = request.getMethod();
		System.out.println("method : " + method);
		if (method.equalsIgnoreCase("POST")) {
			String userid = request.getParameter("userid");
			String password = request.getParameter("password");
			MemberDaoInter dao = MemberDaoImple.getDao();
			Map<String, String> paramMap = new HashMap<String, String>();
			paramMap.put("userid", userid);
			paramMap.put("password", password);
			MemberVO vo = dao.login(paramMap);
			System.out.println("Mapper검수");
			System.out.println("num : " + vo.getNum());
			System.out.println("name : " + vo.getName());
			System.out.println("email : " + vo.getEmail());
			if(vo != null) { // login 성공
				// 세션에 등록하기
				HttpSession session = request.getSession();
				session.setAttribute("loginUser", vo);
				return new ActionForward("main.ict?cmd=index", true);
			} else { // login 실패
				request.setAttribute("msg", "로그인 실패!");
				return new ActionForward("login", false);
			}
		}
		request.setAttribute("msg", "올바른 경로가 아닙니다!");
		return new ActionForward("login", false);
	}

}
