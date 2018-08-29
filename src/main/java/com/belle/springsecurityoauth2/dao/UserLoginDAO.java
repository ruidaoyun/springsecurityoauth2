package com.belle.springsecurityoauth2.dao;

import com.belle.springsecurityoauth2.model.entity.UserLogin;

import java.util.List;

public interface UserLoginDAO {
    UserLogin selectUserById(Long id);

    UserLogin selectUserByUsername(String username);

    List<UserLogin> selectAllUsers();

    Integer insertUser(UserLogin user);

    Integer updateUserOnPasswordById(UserLogin user);

    Integer deleteUserById(Long id);
}
