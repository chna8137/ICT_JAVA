package kr.co.ictedu.myictstudy0521.vo;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("givo")
public class GalleryImagesVO {
	
	private int galleryid;
	
	private String imagename;

}
