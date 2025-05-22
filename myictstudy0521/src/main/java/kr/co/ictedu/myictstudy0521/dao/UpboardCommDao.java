package kr.co.ictedu.myictstudy0521.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.ictedu.myictstudy0521.vo.UpBoardCommVO;

@Mapper
public interface UpboardCommDao {
	
	void addComment(UpBoardCommVO comment);
	
	List<UpBoardCommVO> listComment(int num);

}
