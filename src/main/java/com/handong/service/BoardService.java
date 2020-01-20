package com.handong.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.handong.dto.BoardDto;

@Transactional
public interface BoardService {
	public void create(BoardDto board);
	public BoardDto read(int bno);
	public List<BoardDto> readList();
	public void update(BoardDto board);
	public void delete(int bno);
}
