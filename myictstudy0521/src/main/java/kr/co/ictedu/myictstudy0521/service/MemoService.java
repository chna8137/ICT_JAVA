package kr.co.ictedu.myictstudy0521.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.co.ictedu.myictstudy0521.dao.MemoDao;
import kr.co.ictedu.myictstudy0521.vo.MemoVO;

@Service
public class MemoService {

	@Autowired
	private MemoDao memoDao;

	public List<MemoVO> list(Map<String, String> map) {
		return memoDao.list(map);
	}
	
	public int totalCount() {
		return memoDao.totalCount();
	}

}
