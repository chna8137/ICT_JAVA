package kr.co.ictedu.myictstudy0521.vo;

import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("gvo")
public class GalleryVO {
	
	private int num;
	
	private String title;
	
	private String contents;
	
	private String writer;
	
	private String reip;
	
	private int hit;
	
	private String gdate;
	
	// 1 : N 즉 collection관계
	private List<GalleryImagesVO> getimglist;

}
