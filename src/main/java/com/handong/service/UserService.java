package com.handong.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.handong.dto.UserDto;

@Service
public interface UserService {
	public void createUser(UserDto user);
	public UserDto readUser(String userID);
	public boolean login(UserDto user);
	public List<UserDto> readUserList();
	public void updateUser(UserDto user);
}
