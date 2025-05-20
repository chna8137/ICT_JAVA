package kr.co.ictedu.myictstudy.vo;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;


/*
 * application.properties에서 mybatis.type-aliases-package 지정한 패키지기 때문에
 * @Alias(””) 어노테이션으로 등록하면 해당 mapper에서 사용할 수 있다.
 */
@Alias("memovo")
@Getter
@Setter
public class MemoVO {
	
	private int num;
	private String writer;
	private String conts;
	private String mreip;
	private String mdate;

}
