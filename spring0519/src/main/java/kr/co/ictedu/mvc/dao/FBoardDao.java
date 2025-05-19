package kr.co.ictedu.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.ictedu.mvc.dto.FboardDTO;

// <context:component-scan base-package="kr.co.ictedu.mvc" />과 동일
// 데이터 처리를 위한 어노테이션
@Repository
public class FBoardDao implements FboardDaoInter{
	
	// <bean id="ss" class="org.mybatis.spring.SqlSessionTemplate">
	// commit, close 관리를 해줌
	@Autowired
	private SqlSessionTemplate ss;

	@Override
	public List<FboardDTO> listFBoard() {
		
		// ss.selectList(namespace.id값) : List<?>
		// <select id="list" resultType="fvo">
		
		return ss.selectList("fb.list");
	}

	@Override
	public void addFBoard(FboardDTO vo) {
		
		ss.insert("fb.add", vo);
		
	}
	
	@Override
	public void updateHit(int num) {
		
		ss.update("fb.hit", num);
		
	}

	@Override
	public FboardDTO detailFBoard(int num) {
		
		return ss.selectOne("fb.detail", num);
	}

	@Override
	public void updateBoard(FboardDTO vo) {
		
		ss.update("fb.update", vo);
		
	}

	@Override
	public void deleteBoard(int num) {
		
		ss.delete("fb.delete", num);
		
	}

	

}
