package kr.co.ictedu.myictstudy0521.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ictedu.myictstudy0521.dao.UpBoardDao;
import kr.co.ictedu.myictstudy0521.vo.UpBoardVO;

@Service
public class UpBoardService {

	@Autowired
	private UpBoardDao upBoardDao;

	public void add(UpBoardVO vo) {
		upBoardDao.add(vo);
	}

	public List<UpBoardVO> list(Map<String, String> map) {
		return upBoardDao.list(map);
	}

	public void hit(int num) {
		upBoardDao.hit(num);
	}

	public UpBoardVO detail(int num) {
		return upBoardDao.detail(num);
	}

	public void del(int num) {
		upBoardDao.del(num);
	}
	
	public int totalCount() {
		return upBoardDao.totalCount();
	}
}
