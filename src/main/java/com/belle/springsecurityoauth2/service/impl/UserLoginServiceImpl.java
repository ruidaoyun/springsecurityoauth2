package com.belle.springsecurityoauth2.service.impl;

import com.belle.springsecurityoauth2.dao.UserLoginDAO;
import com.belle.springsecurityoauth2.model.dto.CustomUserDetails;
import com.belle.springsecurityoauth2.model.entity.Role;
import com.belle.springsecurityoauth2.model.entity.UserLogin;
import com.belle.springsecurityoauth2.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserLoginServiceImpl implements UserLoginService {
    private  UserLoginDAO userLoginDAO;

    @Autowired
    public UserLoginServiceImpl(UserLoginDAO userLoginDAO) {
        this.userLoginDAO = userLoginDAO;
    }

    @Override
    public UserLogin getUserById(Long id) {
        return userLoginDAO.selectUserById (id);
    }

    @Override
    public boolean saveUser(UserLogin user) {
        return (userLoginDAO.insertUser (user)==1);
    }

    @Override
    public boolean modifyUserOnPasswordById(UserLogin user) {
        return (userLoginDAO.updateUserOnPasswordById (user)==1);
    }

    @Override
    public boolean deleteUserById(Long id) {
        return (userLoginDAO.deleteUserById (id)==1);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserLogin user = userLoginDAO.selectUserByUsername(s);

        if (user == null) {
            throw new UsernameNotFoundException("Could not find the user '" + s + "'");
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<> ();
        //用于添加用户的权限。
        for(Role role:user.getRoles())
        {
            authorities.add(new SimpleGrantedAuthority(role.getRoleName ()));
        }

        // Not involve authorities, so pass null to authorities
        return new CustomUserDetails (user, true, true, true, true, null);

    }
}
