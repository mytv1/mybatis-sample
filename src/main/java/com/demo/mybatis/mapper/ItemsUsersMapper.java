package com.demo.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.demo.mybatis.model.ItemsUsers;

@Mapper
public interface ItemsUsersMapper {
	List<ItemsUsers> selectCommon();
}
