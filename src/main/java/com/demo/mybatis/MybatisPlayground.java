package com.demo.mybatis;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.text.ParseException;
import java.util.Date;

import com.demo.mybatis.mapper.ItemsMapper;
import com.demo.mybatis.mapper.UsersDynamicSqlSupport;
import com.demo.mybatis.mapper.UsersMapper;
import com.demo.mybatis.model.Items;
import com.demo.mybatis.model.Users;

public class MybatisPlayground {
	
	private UsersMapper usersMapper;
	private ItemsMapper itemsMapper;
	
	public MybatisPlayground(UsersMapper usersMapper, ItemsMapper itemsMapper) {
		this.usersMapper = usersMapper;
		this.itemsMapper = itemsMapper;
	}
	
	public void deleteALlUsers() {
		itemsMapper.delete(i -> i);
		usersMapper.delete(u -> u);
	}
	
	public void sampleInsertUsers(String userName, Date birthday) throws ParseException {
		Users users = new Users();

		users.setName(userName);
		users.setBirthday(birthday);
		
		usersMapper.insert(users);
	}
	
	public void sampleUpdateUsers(String userName1, String userName2) {
		Users users = usersMapper.selectOne(u -> 
				u.where(UsersDynamicSqlSupport.name, isEqualTo(userName1))).get();

		users.setName(userName2);
		usersMapper.updateByPrimaryKey(users);

	}
	
	public void sampleInsertItems(String userName, String itemName) {
		Users users = usersMapper.selectOne(u -> 
		u.where(UsersDynamicSqlSupport.name, isEqualTo(userName))).get();
		
		Items items = new Items();
		items.setName(itemName);
		items.setUserId(users.getId());
		itemsMapper.insert(items);
	}
}
