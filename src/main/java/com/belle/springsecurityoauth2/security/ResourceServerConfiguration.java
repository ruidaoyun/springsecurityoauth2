package com.belle.springsecurityoauth2.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;


@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                //.requestMatchers(CorsUtils::isPreFlightRequest).permitAll()
                //.antMatchers(HttpMethod.OPTIONS).permitAll()
                .antMatchers(HttpMethod.GET, "/users/all").permitAll()
                .antMatchers ("/emp/all").hasRole ("admin")
                .antMatchers ("/get").hasRole ("admin")
                .anyRequest().authenticated();

    }

}
