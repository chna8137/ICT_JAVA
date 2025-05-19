package kr.co.ictedu.mvc.dao;

import java.util.List;

import kr.co.ictedu.mvc.dto.FboardDTO;

public interface FboardDaoInter {
	
	// <select id="list" resultType="fvo">
	List<FboardDTO> listFBoard();
	
	// <insert id="add" parameterType="fvo">
	void addFBoard(FboardDTO vo);
	
	// <update id="hit" parameterType="int">
	void updateHit(int num);
	
	// <select id="detail" parameterType="int" resultType="fvo">
	FboardDTO detailFBoard(int num);
	
	// <update id="update" parameterType="fvo">
	void updateBoard(FboardDTO vo);
	
	// <delete id="delete" parameterType="int">
	void deleteBoard(int num);
}
