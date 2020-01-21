package com.handong.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handong.dto.UserDto;
import com.handong.mapper.UserMapper;

@Service
public class UserSeviceImpl implements UserService {
	@Autowired UserMapper userMapper;
	
	@Override
	public void createUser(UserDto user) {
		userMapper.insert(user);
	}

	@Override
	public UserDto readUser(String userID) {
		return userMapper.selectOne(userID);
	}

	@Override
	public boolean login(UserDto user) {
		UserDto res = userMapper.login(user.getUserID(), user.getUserPassword()); 
		
		return res!=null?true:false; 
	}

	@Override
	public List<UserDto> readUserList() {
		return userMapper.selectList();
	}

	@Override
	public void updateUser(UserDto user) {
		userMapper.update(user);
	}

}
