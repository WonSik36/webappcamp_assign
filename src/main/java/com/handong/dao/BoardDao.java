package com.handong.dao;

import java.util.List;

import com.handong.dto.BoardDto;

public interface BoardDao {
	public void insert(BoardDto board);
	public BoardDto selectOne(int bno);
	public List<BoardDto> selectList();
	public void update(BoardDto board);
	public void updateViewCount(int bno);
	public void delete(int bno);
}
