package kr.co.ictedu.myictstudy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ictedu.myictstudy.dao.MemoDao;
import kr.co.ictedu.myictstudy.vo.MemoVO;

@Service
public class MemoService {

	@Autowired
	private MemoDao memoDao;

	// void add(MemoVO vo);
	public void add(MemoVO vo) {
		memoDao.add(vo);
	}

	public List<MemoVO> list() {
		return memoDao.list();
	}

	public MemoVO detail(int num) {
		return memoDao.detail(num);
	}
	
	// void update(int num);
	public void update(MemoVO vo) {
		memoDao.update(vo);
	}

	public void del(int num) {
		memoDao.del(num);
	}

}
