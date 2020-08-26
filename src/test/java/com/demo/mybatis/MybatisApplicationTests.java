package com.demo.mybatis;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.mybatis.mapper.ItemsUsersMapper;
import com.demo.mybatis.mapper.UsersMapper;
import com.demo.mybatis.model.ItemsUsers;

@SpringBootTest
class MybatisApplicationTests {

	@Autowired
	UsersMapper usersMapper;
	
	@Autowired
	ItemsUsersMapper itemsUsersMapper;
	
	@Test
	void contextLoads() {
		long totalRows = usersMapper.count(c -> c);	
		assertEquals(totalRows, 1);

		List<ItemsUsers> listItemsUsers = itemsUsersMapper.selectCommon();
		assertEquals(listItemsUsers.get(0).getItem_name(), "test item 1");
		assertEquals(listItemsUsers.get(0).getUser_name(), "test user 2");
		assertEquals(listItemsUsers.get(1).getItem_name(), "test item 2");
		assertEquals(listItemsUsers.get(1).getUser_name(), "test user 2");
	}

}
