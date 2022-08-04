package com.demo.junitmockitodemospringboot.dao;

import com.demo.junitmockitodemospringboot.model.Employee;
import com.demo.junitmockitodemospringboot.exception.EmployeeException;
import com.demo.junitmockitodemospringboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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
        if(allEmp.isEmpty()){
            throw new EmployeeException(200, "No employees found ");
        }
        return allEmp;
    }

}
