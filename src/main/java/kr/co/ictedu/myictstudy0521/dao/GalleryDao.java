package kr.co.ictedu.myictstudy0521.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.ictedu.myictstudy0521.vo.GalleryImagesVO;
import kr.co.ictedu.myictstudy0521.vo.GalleryVO;

@Mapper
public interface GalleryDao {
	
	void add(GalleryVO gvo);
	
	void addImg(List<GalleryImagesVO> gvo);

}
