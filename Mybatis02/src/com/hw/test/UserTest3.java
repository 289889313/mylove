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
import com.hw.entity.Orders;
import com.hw.entity.User;
import com.hw.entity.UserSelectResultVo;
import com.hw.entity.UserSelectVo;

public class UserTest3 {
	SqlSessionFactory sqlSessionFactory;
	
	@Before
	public void setUp() throws Exception {
		InputStream cfg=Resources.getResourceAsStream("SqlMapConfig.xml");
		sqlSessionFactory=
				new SqlSessionFactoryBuilder().build(cfg);
		
		
	}

	
	@Test
	public void testGetUsersByVo() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		UserSelectVo usv=new UserSelectVo();
		Orders orders=new Orders();
		orders.setOrderDate(new Timestamp(118, 4, 14, 0, 0, 0, 0));
//		orders.setOrderNote("购买镜头");
		
		Items items=new Items();
		items.setItemName("Canon IXUS 115 数码相机");
		
		usv.setItems(items);
		usv.setOrders(orders);
		
		List<User> us=userMapper.getUsersByVo(usv);
		System.out.println(us.get(0));
	}
	
	@Test
	public void testGetUsersResultByVo() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		UserSelectVo usv=new UserSelectVo();
		Orders orders=new Orders();
		orders.setOrderDate(new Timestamp(118, 4, 14, 0, 0, 0, 0));
		orders.setOrderNote("购买镜头");
		
		Items items=new Items();
		items.setItemName("Canon IXUS 115 数码相机");
		usv.setItems(items);
		usv.setOrders(orders);
		
		List<UserSelectResultVo> us=userMapper.getUsersResultByVo(usv);
		System.out.println(us.get(0).getItemName());
	}
	@Test
	public void testGetUsersResultMapByVo() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		UserSelectVo usv=new UserSelectVo();
		Orders orders=new Orders();
		orders.setOrderDate(new Timestamp(118, 4, 14, 0, 0, 0, 0));
		orders.setOrderNote("购买镜头");
		
		Items items=new Items();
		items.setItemName("Canon IXUS 115 数码相机");
		usv.setItems(items);
		usv.setOrders(orders);
		
		List<UserSelectResultVo> us=userMapper.getUsersResultMapByVo(usv);
		System.out.println(us.get(0).getItemName());
	}
	@Test
	public void testGetOneUserByIdtest() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		int num=userMapper.getOneUserByIdtest(11);
		System.out.println(num);
	}

	
	@Test
	public void testGetUsersByList() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		
		UserSelectVo usv=new UserSelectVo();
		
		List<Integer> ids=new ArrayList<Integer>();
		ids.add(1);
		ids.add(3);
		ids.add(5);
		usv.setIds(ids);
		
		List<User> us =userMapper.getUsersByList(usv);
//		List<User> us =userMapper.getUsersByList(ids);
		
//		List<User> us =userMapper.getUsersByList(new int[]{1,3,5,6});
		
		Map<String , Object> map=new HashMap<String , Object>();
		map.put("uname", "sa");
		map.put("userids", ids);
//		List<User> us =userMapper.getUsersByList(map);
		
		
				
		
		System.out.println(us.size());
	}
	@Test
	public void testPiLiangChaRu() {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		
		UserSelectVo usv=new UserSelectVo();
		List<User> users=new ArrayList<User>();
		users.add(new User(100,"a"));
		users.add(new User(200,"b"));
		users.add(new User(300,"c"));
	
		usv.setUsers(users);
		
		int n=userMapper.piLiangChaRu(usv);
		System.out.println(n);
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
