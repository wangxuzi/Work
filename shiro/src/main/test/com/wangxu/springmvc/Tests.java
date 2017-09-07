package com.wangxu.springmvc;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.wangxu.springmvc.pojo.User;

import net.sf.cglib.transform.impl.AddDelegateTransformer;

public class Tests {

	private SqlSessionFactory ssf;
	
	private SqlSession session;
	
	@Before
	public void init() throws IOException{
		InputStream in=Resources.getResourceAsStream("mybatis-configs.xml");
		
		ssf=new SqlSessionFactoryBuilder().build(in);
	
	
	
	}
	@Test
	public void add() {
	
	  User user=new User("sd", "123");
		session.insert("com.wangxu.springmvc.mapper.UserMapper.add", user);
		session.commit();
		
	}
	

	@Test
	public void get() {
		SqlSession session=ssf.openSession();
		User user=session.selectOne("com.wangxu.springmvc.mapper.UserMapper.finduser",2);
		System.out.println(user);
	}
	

	@After
	public void destory(){
		
		session.close();
	}
	
	
}
