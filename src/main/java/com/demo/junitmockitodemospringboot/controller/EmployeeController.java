package com.demo.junitmockitodemospringboot.controller;

import com.demo.junitmockitodemospringboot.model.Employee;
import com.demo.junitmockitodemospringboot.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(("/employee"))
public class EmployeeController {

    Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService service;

    @GetMapping("/getById")
    public Employee getEmployeeById(@RequestParam("id")int id){
            logger.info("Fetching employee details for employeeId= {}", id);
            return service.getEmployeeById(id);
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmployees(){
        logger.info("Getting all employees");
        return service.getAllEmployees();
    }

}
