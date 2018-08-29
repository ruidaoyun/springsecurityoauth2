package com.belle.springsecurityoauth2.controller;


import com.belle.springsecurityoauth2.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @GetMapping("/one")
    public Map getOne(@RequestParam("empno")Integer empno){
        HashMap<String, Object> map=new HashMap<> ();
        map.put ("emp",empService.getOne (empno));
        return map;
    }

    @GetMapping("/all")
    public Map getAll(){
        HashMap<String,Object> map=new HashMap<> ();
        map.put ("emp",empService.getAll ());
        return map;
    }
}
