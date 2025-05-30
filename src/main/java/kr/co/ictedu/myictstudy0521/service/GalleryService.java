package kr.co.ictedu.myictstudy0521.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.ictedu.myictstudy0521.dao.GalleryDao;
import kr.co.ictedu.myictstudy0521.vo.GalleryImagesVO;
import kr.co.ictedu.myictstudy0521.vo.GalleryVO;

@Service
public class GalleryService {

	@Autowired
	private GalleryDao galleryDao;
	// transcatoinProcess 메서드 안에서
	// galleryDao.add(gvo);
	// galleryDao.addImg(gvoList); 를 하나의 단위로 처리해주기 때문에
	// 만야 중간에 오류가 발생하면 모두 rollback으로 처리하고 
	// 오류가 발생하지 않으면 하나의 단위로 commit

//	@Transactional
	public void transcationProcess(GalleryVO gvo, List<GalleryImagesVO> gvoList) {
		galleryDao.add(gvo);
		
		// 트랜잭션 테스트를 하기 위해서 널 처리 해보기
//		if (!gvoList.isEmpty()) {
//			gvoList.get(0).setImagename(null); // NOT NULL 제약 조건 위반 유도
//		}
		galleryDao.addImg(gvoList);
	}

}
