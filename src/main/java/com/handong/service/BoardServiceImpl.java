package com.handong.service;

import com.handong.dto.BoardDto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handong.dao.BoardDao;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired private BoardDao boardDao;
	
	@Override
	public void create(BoardDto board) {
		boardDao.insert(board);
	}

	@Override
	public BoardDto read(int bno) {
		boardDao.updateViewCount(bno);
		return boardDao.selectOne(bno);
	}

	@Override
	public List<BoardDto> readList() {
		return boardDao.selectList();
	}

	@Override
	public void update(BoardDto board) {
		boardDao.update(board);
	}

	@Override
	public void delete(int bno) {
		boardDao.delete(bno);
	}

}
