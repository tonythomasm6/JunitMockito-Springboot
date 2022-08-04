package com.demo.junitmockitodemospringboot.Service;

import com.demo.junitmockitodemospringboot.Model.Employee;
import com.demo.junitmockitodemospringboot.dao.EmployeeDAO;
import com.demo.junitmockitodemospringboot.exception.EmployeeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeDAO dao;




    public Employee getEmployeeById(int id) throws EmployeeException {
        return dao.getEmployeeById(id);
    }

    public List<Employee> getAllEmployees() throws EmployeeException{
        return dao.getAllEmployees();
    }


}
