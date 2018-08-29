package com.belle.springsecurityoauth2.dao;


import com.belle.springsecurityoauth2.model.entity.Emp;

import java.util.List;

public interface EmpDAO {
    List<Emp> getAll();

    Emp getOne(Integer empno);
}
