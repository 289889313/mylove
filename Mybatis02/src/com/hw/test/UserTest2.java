package com.hw.test;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.hw.dao.UserMapper;
import com.hw.entity.User;

public class UserTest2 {
	SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void setUp() throws Exception {
		InputStream cfg=Resources.getResourceAsStream("SqlMapConfig.xml");
		sqlSessionFactory=
				new SqlSessionFactoryBuilder().build(cfg);
		
		
	}

	@Test
	public void testInsertOneUser() {
		
		User u=new User(8, "嗯嗯");
		
	}
	@Test
	public void testDeleteUserById() {
		
		
	}
	@Test
	public void testUpdateUser() {
		
		User u=new User(8, "嗯嗯");
		
		
		
	}
	@Test
	public void testSelectUser() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		SqlSession sqlSession1=sqlSessionFactory.openSession();
		SqlSession sqlSession2=sqlSessionFactory.openSession();
		SqlSession sqlSession3=sqlSessionFactory.openSession();
		SqlSession sqlSession4=sqlSessionFactory.openSession();
		
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		UserMapper userMapper1=sqlSession1.getMapper(UserMapper.class);
		UserMapper userMapper2=sqlSession2.getMapper(UserMapper.class);
		UserMapper userMapper3=sqlSession3.getMapper(UserMapper.class);
		UserMapper userMapper4=sqlSession4.getMapper(UserMapper.class);
		
		List<User> u1=userMapper.getOneUserById(1);
		System.out.println(u1);
		sqlSession.close();
		
		//导致二级缓存清空
//		User u=new User(1,"sa");
//		u.setLoginName("test");
//		userMapper2.updateUser(u);
//		sqlSession2.commit();
		
		List<User> u2=userMapper1.getOneUserById(1);
		System.out.println("u2="+u2);
//		List<User> u3=userMapper2.getOneUserById(1);
//		System.out.println(u3);
//		List<User> u4=userMapper3.getOneUserById(1);
//		System.out.println(u4);
//		List<User> u5=userMapper4.getOneUserById(1);
//		System.out.println(u5);
	}

}
