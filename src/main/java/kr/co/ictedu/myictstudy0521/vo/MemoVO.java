package kr.co.ictedu.myictstudy0521.vo;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Alias("memovo")
@Getter
@Setter
public class MemoVO {
	
	private int num;
	private String writer;
	private String conts;
	private String mreip;
	private String mdate;
	
	// Post방식의 multipart/form-data 즉 파일 업로드 일 때 데이터가 저장
	private MultipartFile mfile;

}
