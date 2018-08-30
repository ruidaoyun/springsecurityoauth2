package com.belle.springsecurityoauth2.service;


import com.belle.springsecurityoauth2.model.entity.Users;

import java.util.List;

public interface UsersService {
    List<Users> getAll();

    Users getUserById(Integer id);

    Users getUserByName(String name);

    Integer deleteUsersById(Integer id);

    Integer insertUsers(Users users);

    Integer updateUsers(Users users);
}
