package com.handong.dto;

import java.util.Date;

import lombok.Data;

@Data
public class BoardDto {
	private Integer bno;	// AUTO INCREMENT
	private String title;
	private String content;
	private String writer;
	private Date regdate;	// DEFAULT NOW()
	private int viewcnt;	// DEFAULT 0
	private Date moddate;	// DEFAULT CURRENT_TIMESTAMP
	private boolean removed;	// DEFAULT false(0)
}
