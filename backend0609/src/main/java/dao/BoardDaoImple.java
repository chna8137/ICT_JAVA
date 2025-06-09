package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import factory.FactoryService;
import vo.BoardVO;

public class BoardDaoImple implements BoardDaoInter {

	private static BoardDaoImple dao;

	private BoardDaoImple() {
	}

	public synchronized static BoardDaoImple getDao() {
		if (dao == null) {
			dao = new BoardDaoImple();
		}
		return dao;
	}

	@Override
	public void addBoard(BoardVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		ss.insert("board.save", vo);
		ss.commit();
		ss.close();

	}

	@Override
	public List<BoardVO> listBoard() {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<BoardVO> list = ss.selectList("board.list");
		ss.close();
		return list;
	}

	@Override
	public BoardVO detailBoard(int num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		BoardVO vo = ss.selectOne("board.detail", num);
		ss.close();
		return vo;
	}

	@Override
	public void delBoard(int num) {
		SqlSession ss = FactoryService.getFactory().openSession();
		ss.delete("board.del", num);
		ss.commit();
		ss.close();		
	}

	@Override
	public void updateBoard(BoardVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		ss.update("board.up", vo);
		ss.commit();
		ss.close();
		
	}

}
