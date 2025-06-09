package dao;

import java.util.Map;

import vo.MemberVO;

public interface MemberDaoInter {
	
	MemberVO login(Map<String, String> map);

}
