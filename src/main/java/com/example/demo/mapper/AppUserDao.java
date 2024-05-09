package com.example.demo.mapper;

import com.example.demo.entity.AppUser;

import java.util.List;

public interface AppUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(AppUser record);

    int insertSelective(AppUser record);

    AppUser selectByPrimaryKey(Integer id);

    List<AppUser> selectAll();

    int updateByPrimaryKeySelective(AppUser record);

    int updateByPrimaryKey(AppUser record);
}