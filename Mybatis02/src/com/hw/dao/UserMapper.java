package com.hw.dao;
import java.util.List;
import java.util.Map;

import com.hw.entity.OrderAndUserVo;
import com.hw.entity.Orders;
import com.hw.entity.User;
import com.hw.entity.UserSelectResultVo;
import com.hw.entity.UserSelectVo;

public interface UserMapper {
	public List<User>  getOneUserById(int userId);	
	public int  getOneUserByIdtest(int userId);	
	
	public List<User>  getUsersByVo(UserSelectVo usv);	
	
	//输入参数是list  array等
	public List<User>  getUsersByList(UserSelectVo userSelectVo);	
	
	public List<User>  getUsersByList(List list);
	
	public List<User>  getUsersByList(int[] array);	
	
	
	
	public List<User>  getUsersByList(Map map);	
	
	public List<UserSelectResultVo>  getUsersResultByVo(UserSelectVo usv);	
	public List<UserSelectResultVo>  getUsersResultMapByVo(UserSelectVo usv);	
	
	public int insertOneUser(User user);
	public int piLiangChaRu(UserSelectVo usv);
	
	
	public int deleteUserById(int userId);
	public int updateUser(User user);
	
	//订单和用户的一对一操作
	public List<OrderAndUserVo> getOrderAndUser();
	
	public List<Orders> getOrderAndUserResultMap();
	
	public List<Orders> getOrderById(int oid);
	
	
	
	
	
	
	
	
	
	

}
