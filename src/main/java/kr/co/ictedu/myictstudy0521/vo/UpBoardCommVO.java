package kr.co.ictedu.myictstudy0521.vo;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Alias("upbcomm")
public class UpBoardCommVO {
	
	private int num;
	
	private int ucode;
	
	private String uwriter; // 댓글 작성자
	
	private String ucontent; // 댓글 내용
	
	private String reip; // 주소
	
	private String uregdate; // 댓글 작성 날짜

}

/*
CREATE TABLE upboard_comm(
num NUMBER PRIMARY KEY,
ucode NUMBER,
uwriter VARCHAR2(34) NOT NULL,
ucontent VARCHAR2(400) NOT NULL,
reip VARCHAR2(23),
uregdate DATE DEFAULT sysdate,
CONSTRAINT fk_upboard_num FOREIGN KEY(ucode)
REFERENCES upboard(num)
);

CREATE SEQUENCE upboard_comm_seq
INCREMENT BY 1 START WITH 1;
*/
