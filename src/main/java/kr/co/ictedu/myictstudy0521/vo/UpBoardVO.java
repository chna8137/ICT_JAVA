package kr.co.ictedu.myictstudy0521.vo;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("upvo")
public class UpBoardVO {
	
	private int num;
	private String title;
	private String writer;
	private String content;
	private String imgn;
	private int hit;
	private String reip;
	private String bdate;
	
	// Post방식의 multipart/form-data 즉 파일 업로드 일 때 데이터가 저장
	private MultipartFile mfile;

}

/*
CREATE TABLE UPBOARD(
num NUMBER PRIMARY KEY,
title VARCHAR2(255) NOT NULL,
writer VARCHAR2(100) NOT NULL,
CONTENT CLOB,
imgn VARCHAR2(255),
hit NUMBER DEFAULT 0,
reip VARCHAR2(50),
bdate DATE DEFAULT sysdate
);

CREATE SEQUENCE upboard_seq
INCREMENT BY 1 START WITH 1;
 * */
