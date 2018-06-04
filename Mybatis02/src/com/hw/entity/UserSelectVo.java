package com.hw.entity;

import java.util.List;

/**
 * 作为查询条件的对象
 * */
public class UserSelectVo {
	private List<Integer> ids;
	private Orders orders;
	private Items items;
	
	private List<User> users;
	
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	public Items getItems() {
		return items;
	}
	public void setItems(Items items) {
		this.items = items;
	}
	public List<Integer> getIds() {
		return ids;
	}
	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	

}
