package com.handong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.handong.dto.BoardDto;
import com.handong.service.BoardService;

@Controller
@RequestMapping(value = "/") 
public class BoardController {
	@Autowired
	private BoardService boardService;

	@RequestMapping(value= "/list", method = RequestMethod.GET)
	public ModelAndView listAll(ModelAndView mv){
		mv.addObject("list", boardService.readList());
		mv.setViewName("list");

		return mv;
	}

	@RequestMapping(value= "/register", method = RequestMethod.GET)
	public ModelAndView registerForm(ModelAndView mv){
		mv.setViewName("register");

		return mv;
	}

	@RequestMapping(value= "/register", method = RequestMethod.POST)
	public ModelAndView registerBoard(@ModelAttribute BoardDto board, ModelAndView mv){
		boardService.create(board);

		mv.setViewName("redirect:list");

		return mv;
	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public ModelAndView read(@RequestParam("bno") int bno, ModelAndView mv) throws Exception{
		BoardDto board = boardService.read(bno);

		mv.addObject("board", board);
		mv.setViewName("content");

		return mv;
	}

	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public ModelAndView modifyForm(@RequestParam("bno") int bno, ModelAndView mv) throws Exception{
		BoardDto board = boardService.read(bno);

		mv.addObject("board", board);
		mv.setViewName("modify");

		return mv;
	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public ModelAndView modifyBoard(@ModelAttribute BoardDto board, ModelAndView mv) throws Exception{
		boardService.update(board);

		mv.setViewName("redirect:list");

		return mv;
	}

	@RequestMapping(value = "/remove", method = RequestMethod.GET)// POST방식으로 데이터 전송

	public ModelAndView removePOST(@RequestParam("bno") int bno, ModelAndView mv) throws Exception{
		boardService.delete(bno);

		mv.setViewName("redirect:list");

		return mv;
	}
}
