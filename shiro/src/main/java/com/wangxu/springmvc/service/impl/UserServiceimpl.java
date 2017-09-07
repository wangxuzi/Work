package com.wangxu.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.wangxu.springmvc.mapper.UserMapper;
import com.wangxu.springmvc.pojo.User;
import com.wangxu.springmvc.service.UserService;
@Service
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED,timeout=5)
public class UserServiceimpl implements UserService{

	@Override
	public boolean userlogin(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User finduser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		
	}


}
