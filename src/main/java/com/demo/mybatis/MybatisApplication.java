package com.demo.mybatis;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.demo.mybatis.mapper.ItemsMapper;
import com.demo.mybatis.mapper.UsersMapper;

@SpringBootApplication
public class MybatisApplication {

	@Autowired
	UsersMapper usersMapper;

	@Autowired
	ItemsMapper itemsMapper;

	public static void main(String[] args) {
		SpringApplication.run(MybatisApplication.class, args);
	}

	@Bean
	public CommandLineRunner testInsert(ApplicationContext ctx) {
		return args -> {
			
			MybatisPlayground ground = new MybatisPlayground(usersMapper, itemsMapper);
			
			ground.deleteALlUsers();
			
			// Init user 1 
			String userName = "test user 1";
			String birthdayAsStr = "2010-12-01";
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
			Date birthday = format.parse(birthdayAsStr);
			ground.sampleInsertUsers(userName, birthday);

			ground.sampleUpdateUsers("test user 1", "test user 2");
			ground.sampleInsertItems("test user 2", "test item 1");
			ground.sampleInsertItems("test user 2", "test item 2");
		};
	}
}
