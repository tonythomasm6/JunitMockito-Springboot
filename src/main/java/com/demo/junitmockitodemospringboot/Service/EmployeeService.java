package com.demo.junitmockitodemospringboot.Service;

import com.demo.junitmockitodemospringboot.Model.Employee;
import com.demo.junitmockitodemospringboot.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeDAO dao;




    public Employee getEmployeeById(int id){
        Employee emp =dao.getEmployeeById(id);

        return emp;
    }


}
