package kr.co.ictedu.myictstudy0521.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.co.ictedu.myictstudy0521.vo.MemoVO;


@Mapper
public interface MemoDao {
		
		List<MemoVO> list(Map<String, String> map); // 리스트
		
		// 추가하기 - 전체 데이터의 값
		int totalCount();
}
