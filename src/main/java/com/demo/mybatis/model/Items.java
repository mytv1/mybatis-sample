package com.demo.mybatis.model;

import javax.annotation.Generated;

public class Items {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.211648+09:00", comments = "Source field: items.id")
	private Integer id;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.211732+09:00", comments = "Source field: items.user_id")
	private Integer userId;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.21181+09:00", comments = "Source field: items.name")
	private String name;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.21168+09:00", comments = "Source field: items.id")
	public Integer getId() {
		return id;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.211708+09:00", comments = "Source field: items.id")
	public void setId(Integer id) {
		this.id = id;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.211757+09:00", comments = "Source field: items.user_id")
	public Integer getUserId() {
		return userId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.211786+09:00", comments = "Source field: items.user_id")
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.211834+09:00", comments = "Source field: items.name")
	public String getName() {
		return name;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.211862+09:00", comments = "Source field: items.name")
	public void setName(String name) {
		this.name = name;
	}
}