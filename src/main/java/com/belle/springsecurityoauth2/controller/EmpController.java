package com.belle.springsecurityoauth2.controller;


import com.belle.springsecurityoauth2.model.entity.Emp;
import com.belle.springsecurityoauth2.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("/one")
    public Emp getOne(@RequestParam("empno")Integer empno){
        return empService.getOne (empno);
    }

    @GetMapping("/all")
    public List<Emp> getAll(){
        return empService.getAll ();
    }
}
