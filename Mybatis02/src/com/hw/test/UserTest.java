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

import com.hw.entity.User;

public class UserTest {
	SqlSessionFactory sqlSessionFactory;
	@Before
	public void setUp() throws Exception {
		InputStream cfg=Resources.getResourceAsStream("SqlMapConfig.xml");
		sqlSessionFactory=
				new SqlSessionFactoryBuilder().build(cfg);
		
	}

	@Test
	public void testInsertOneUser() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		sqlSession.insert("insertOneUser",new User(300,"aaa"));
		sqlSession.commit();
		sqlSession.close();
	}
	@Test
	public void testDeleteUserById() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		sqlSession.insert("deleteUserById",300);
		sqlSession.commit();
		sqlSession.close();
	}
	@Test
	public void testUpdateUser() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		User u=new User(8, "嗯嗯");
		u.setLoginName("aaa");
		sqlSession.insert("updateUser",u);
		sqlSession.commit();
		sqlSession.close();
	}
	
	@Test
	public void testSelectUser() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		/*
		 * selectOne:只能执行返回值是唯一对象的查询
		 * selectList：可以查询集合或者一个对象
		 * */
//		User u=sqlSession.selectOne("getOneUserById",1);
		List<User> us=sqlSession.selectList("getOneUserById",1);
		System.out.println(us.size());
		
		sqlSession.close();
	}

}
