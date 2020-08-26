package com.demo.mybatis.model;

import java.util.Date;
import javax.annotation.Generated;

public class Users {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.209677+09:00", comments = "Source field: users.id")
	private Integer id;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.209787+09:00", comments = "Source field: users.birthday")
	private Date birthday;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.209838+09:00", comments = "Source field: users.name")
	private String name;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.209744+09:00", comments = "Source field: users.id")
	public Integer getId() {
		return id;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.209769+09:00", comments = "Source field: users.id")
	public void setId(Integer id) {
		this.id = id;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.209806+09:00", comments = "Source field: users.birthday")
	public Date getBirthday() {
		return birthday;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.209824+09:00", comments = "Source field: users.birthday")
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.209853+09:00", comments = "Source field: users.name")
	public String getName() {
		return name;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-08-23T14:46:02.209871+09:00", comments = "Source field: users.name")
	public void setName(String name) {
		this.name = name;
	}
}