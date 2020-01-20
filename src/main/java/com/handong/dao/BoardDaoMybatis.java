package com.handong.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.handong.dto.BoardDto;

@Repository("boardDao")
public class BoardDaoMybatis implements BoardDao{
	@Autowired private SqlSession sqlSession;
	
	@Override
	public void insert(BoardDto board) {
		sqlSession.insert("com.handong.mapper.BoardMapper.insert", board);
	}

	@Override
	public BoardDto selectOne(int bno) {
		return sqlSession.selectOne("com.handong.mapper.BoardMapper.selectOne", bno);
	}

	@Override
	public List<BoardDto> selectList() {
		return sqlSession.selectList("com.handong.mapper.BoardMapper.selectList");
	}

	@Override
	public void update(BoardDto board) {
		sqlSession.update("com.handong.mapper.BoardMapper.update",board);
	}

	@Override
	public void updateViewCount(int bno) {
		sqlSession.update("com.handong.mapper.BoardMapper.updateViewCount",bno);
	}

	@Override
	public void delete(int bno) {
		sqlSession.update("com.handong.mapper.BoardMapper.delete",bno);
	}

}
