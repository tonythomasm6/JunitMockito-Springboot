package com.demo.junitmockitodemospringboot.dao;

import com.demo.junitmockitodemospringboot.Model.Employee;
import com.demo.junitmockitodemospringboot.data.Data;
import com.demo.junitmockitodemospringboot.exception.EmployeeException;
import com.demo.junitmockitodemospringboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDAO {

    @Autowired
    private EmployeeRepository repo;

    public Employee getEmployeeById(int id) throws EmployeeException{
         Employee e = repo.getById(id);
         if(e!=null){
             return e;
         }else{
             throw new EmployeeException(100, "Employee Not found for the id "+id);
         }

    }

    public List<Employee> getAllEmployees() throws EmployeeException{
        List<Employee> allEmp = repo.findAll();
        return allEmp;
    }

}
