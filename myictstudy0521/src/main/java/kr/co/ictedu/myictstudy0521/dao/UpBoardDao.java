package kr.co.ictedu.myictstudy0521.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.co.ictedu.myictstudy0521.vo.UpBoardVO;

@Mapper
public interface UpBoardDao {
	
	// 추상 메서드 정의
	// 입력 - add, 리스트 - list, hit, detail, delete
	
	void add(UpBoardVO vo); // 입력
	
	List<UpBoardVO> list(Map<String, String> map); // 리스트
	
	List<UpBoardVO> listdemo();
	
	void hit(int num); // 조회수
	
	UpBoardVO detail(int num); // 상세보기
	
	void del(int num); // 삭제
	
	// 추가하기 - 전체 데이터의 값
	int totalCount();

}
