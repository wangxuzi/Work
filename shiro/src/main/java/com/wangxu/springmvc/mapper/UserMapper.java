package com.wangxu.springmvc.mapper;

import org.apache.ibatis.annotations.Param;

import com.wangxu.springmvc.pojo.User;

public interface UserMapper {
	
	public  boolean userlogin(@Param("name")String name,@Param("password")String password);
		
    public User finduser(int id);
  
    public void delete(int id);
    public void add(User user);
}
