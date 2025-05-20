package kr.co.ictedu.myictstudy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.ictedu.myictstudy.vo.MemoVO;

@Mapper
public interface MemoDao {
	
	void add(MemoVO vo);
	
	List<MemoVO> list();
	
	MemoVO detail(int num);
	
	void update(MemoVO vo);
	
	void del(int num);
	

}
