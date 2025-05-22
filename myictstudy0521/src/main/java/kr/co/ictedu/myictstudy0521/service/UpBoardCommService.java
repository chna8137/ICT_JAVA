package kr.co.ictedu.myictstudy0521.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ictedu.myictstudy0521.dao.UpboardCommDao;
import kr.co.ictedu.myictstudy0521.vo.UpBoardCommVO;

@Service
public class UpBoardCommService {

	@Autowired
	private UpboardCommDao upboardCommDao;

	public void addComment(UpBoardCommVO vo) {
		upboardCommDao.addComment(vo);
	}

	public List<UpBoardCommVO> listComment(int num) {
		return upboardCommDao.listComment(num);
	}

}
