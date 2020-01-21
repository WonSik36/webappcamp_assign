package com.handong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.handong.dto.UserDto;

@Mapper
public interface UserMapper {
	public void insert(UserDto user);
	public UserDto selectOne(String userID);
	public List<UserDto> selectList();
	public UserDto login(@Param("userID") String id, @Param("userPassword") String pw);
	public int userCount();
	public void delete(String userID);
	public void deleteAll();
	public void update(UserDto user);
}