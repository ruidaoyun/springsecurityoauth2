package com.belle.springsecurityoauth2.service;

import com.belle.springsecurityoauth2.model.entity.UserLogin;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserLoginService extends UserDetailsService {
    UserLogin getUserById(Long id);

    boolean saveUser(UserLogin user);

    boolean modifyUserOnPasswordById(UserLogin user);

    boolean deleteUserById(Long id);
}
