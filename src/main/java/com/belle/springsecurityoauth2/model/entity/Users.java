package com.belle.springsecurityoauth2.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Users {

    private Integer id;
    private String name;
    private String phone;
    private String email;
    private String education;
    private String graduationSchool;
    private String profession;
    private String profile;

}
