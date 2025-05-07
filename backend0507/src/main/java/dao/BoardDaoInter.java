package dao;

import java.util.List;

import vo.BoardVO;

public interface BoardDaoInter {
	
//	입력 메서드
	void addBoard(BoardVO vo);

//	출력 메서드
	List<BoardVO> listBoard();
	
//	selectOne : VO
//	SELECT num, subject, writer, hit, contents, hit, reip, bdate FROM board where num = #{num}
	BoardVO detailBoard(int num);
}
