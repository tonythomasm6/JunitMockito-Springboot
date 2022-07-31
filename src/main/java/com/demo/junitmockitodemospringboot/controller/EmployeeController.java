package com.demo.junitmockitodemospringboot.controller;

import com.demo.junitmockitodemospringboot.Model.Employee;
import com.demo.junitmockitodemospringboot.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/getById")
    public Employee getEmployeeById(@RequestParam("id")int id){
            return service.getEmployeeById(id);
    }

}
