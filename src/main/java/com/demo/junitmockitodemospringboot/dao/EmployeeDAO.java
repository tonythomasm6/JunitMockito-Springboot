package com.demo.junitmockitodemospringboot.dao;

import com.demo.junitmockitodemospringboot.Model.Employee;
import com.demo.junitmockitodemospringboot.data.Data;
import com.demo.junitmockitodemospringboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDAO {

    @Autowired
    private EmployeeRepository repo;

    public Employee getEmployeeById(int id){
        return repo.getById(id);

    }
}
