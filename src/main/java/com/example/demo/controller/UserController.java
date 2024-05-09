package com.example.demo.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.mapper.AppUserDao;
import com.example.demo.entity.AppUser;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private AppUserDao appUserDao;

    @GetMapping
    public List<AppUser> findAll() {

        return appUserDao.selectAll();
    }

}
