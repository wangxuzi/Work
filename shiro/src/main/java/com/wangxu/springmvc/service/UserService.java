package com.wangxu.springmvc.service;

import com.wangxu.springmvc.pojo.User;

public interface UserService {

	public boolean userlogin(String username,String password);
	
    public User finduser(int id);
  
    public void delete(int id);
    public void add(User user);
	
}
