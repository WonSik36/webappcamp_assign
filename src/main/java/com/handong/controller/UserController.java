package com.handong.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.handong.dto.UserDto;
import com.handong.service.UserService;

@Controller
public class UserController {
	@Autowired UserService userService;

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginForm(){
		return "loginform";
	}

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loginProcess(HttpSession session, UserDto user){
		if (session.getAttribute("login") != null){
			session.removeAttribute("login");
		}

		// login success
		if (userService.login(user)){
			session.setAttribute("login", user);
			
			return "redirect:list";
		}

		// login failed
		return "redirect:login";
	}

	@RequestMapping(value="/logout")
	public String logout(HttpSession session) {
		session.invalidate();
//		session.removeAttribute("login");
		return "redirect:list";
	}
}
