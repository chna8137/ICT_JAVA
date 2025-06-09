package dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import factory.FactoryService;
import vo.MemberVO;

public class MemberDaoImple implements MemberDaoInter{
	
	private static MemberDaoImple dao;
	
	private MemberDaoImple() {
		
	}
	
	public static MemberDaoImple getDao() {
		if(dao == null) {
			dao = new MemberDaoImple();
		}
		return dao;
	}

	@Override
	public MemberVO login(Map<String, String> map) {
		SqlSession ss = FactoryService.getFactory().openSession();
		MemberVO vo = ss.selectOne("member.login", map);
		ss.close();
		return vo;
	}

}
