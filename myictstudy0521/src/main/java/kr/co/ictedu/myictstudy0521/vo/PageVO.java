package kr.co.ictedu.myictstudy0521.vo;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class PageVO {
	
	// 페이징 처리를 위한 속성
	private int nowPage; // 현재 페이지 값 -> 메뉴 페이지와 연동되는 변수
	private int nowBlock; // 현재 블럭 -> [][][][][] -> 1 block
	private int totalRecord; // 총 게시물 수 .Dao로 부터 받음
	private int numPerPage; // 한 페이지당 보여질 게시물 수
	private int pagePerBlock; // 한 블럭 당 보여질 페이지 블럭 수
	private int totalPage; // 전체 페이수 => totalRecord/numPerPage
	private int totalBlock; // 전체 블럭 수
	private int beginPerPage; // 각 페이지 별 시작 게시물의 index값
	private int endPerPage; // 각 페이지 별 마지막 게시물의 index 값
	
	public PageVO() { // 기본 생성자에서 페이징 처리에 기본 값을 초기화
		this.nowPage = 1;
		this.nowBlock = 1;
		this.numPerPage = 10;
		this.pagePerBlock = 5;
		System.out.println("페이지 처리 객체가 생성되었습니다.");
	}

}
