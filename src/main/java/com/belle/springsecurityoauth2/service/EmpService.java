package com.belle.springsecurityoauth2.service;


import com.belle.springsecurityoauth2.model.entity.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> getAll();

    Emp getOne(Integer empno);
}
