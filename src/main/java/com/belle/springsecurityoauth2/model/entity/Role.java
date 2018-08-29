package com.belle.springsecurityoauth2.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Role {
    private Long id;
    private String roleName;
}
