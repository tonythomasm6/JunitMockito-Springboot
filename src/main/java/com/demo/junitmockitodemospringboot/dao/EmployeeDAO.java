package com.demo.junitmockitodemospringboot.dao;

import com.demo.junitmockitodemospringboot.Model.Employee;
import com.demo.junitmockitodemospringboot.data.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDAO {

    @Autowired
    public Data data;

    public Employee getEmployeeById(int id){
        List<Employee> employees = data.getAllEmployees();
        Optional<Employee> emp = employees.stream().filter(e -> e.getId()==id).findFirst();
        if(emp.isPresent()){
            return emp.get();
        }else{
            return null;
        }

    }
}
