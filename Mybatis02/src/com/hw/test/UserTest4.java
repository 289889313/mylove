package com.hw.test;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.hw.dao.UserMapper;
import com.hw.entity.Items;
import com.hw.entity.OrderAndUserVo;
import com.hw.entity.Orders;
import com.hw.entity.User;
import com.hw.entity.UserSelectResultVo;
import com.hw.entity.UserSelectVo;

public class UserTest4 {
	SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void setUp() throws Exception {
		InputStream cfg=Resources.getResourceAsStream("SqlMapConfig.xml");
		sqlSessionFactory=
				new SqlSessionFactoryBuilder().build(cfg);
	} 
	
	@Test
	public void testGetOrderAndUserResultMap() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		List<Orders> ouv=userMapper.getOrderAndUserResultMap();
		System.out.println(ouv.size());
		System.out.println(ouv.get(0).getUser());
	}
	
	@Test
	public void testGetOrderAndUser() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		List<OrderAndUserVo> ouv=userMapper.getOrderAndUser();
		System.out.println(ouv.size());
		System.out.println(ouv.get(0).getUser());
	}
	
	@Test
	public void testGetOrderById() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		List<Orders> ouv=userMapper.getOrderById(1);
		System.out.println(ouv.size());
//		System.out.println(ouv.get(0).getUser());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
