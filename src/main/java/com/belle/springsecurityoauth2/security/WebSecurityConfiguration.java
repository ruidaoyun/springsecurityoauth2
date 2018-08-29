package com.belle.springsecurityoauth2.security;

import com.belle.springsecurityoauth2.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class WebSecurityConfiguration extends GlobalAuthenticationConfigurerAdapter {

    private final UserLoginService userLoginService;

    @Autowired
    public WebSecurityConfiguration(UserLoginService userLoginService) {
        this.userLoginService = userLoginService;
    }

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userLoginService);
    }

}
