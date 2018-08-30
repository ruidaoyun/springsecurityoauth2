package com.belle.springsecurityoauth2.service.impl;

import com.belle.springsecurityoauth2.dao.UsersDao;
import com.belle.springsecurityoauth2.model.entity.Users;
import com.belle.springsecurityoauth2.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDao usersDao;
    @Override
    public List<Users> getAll() {
        return usersDao.getAll ();
    }

    @Override
    public Users getUserById(Integer id) {
        return usersDao.getUserById (id);
    }

    @Override
    public Users getUserByName(String name) {
        System.out.println (name);
        return usersDao.getUserByName (name);
    }

    @Override
    public Integer deleteUsersById(Integer id) {
        return usersDao.deleteUsersById (id);
    }

    @Override
    public Integer insertUsers(Users users) {
        return usersDao.insertUsers (users);
    }

    @Override
    public Integer updateUsers(Users users) {
        return usersDao.updateUsers (users);
    }
}
