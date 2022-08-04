package com.demo.junitmockitodemospringboot.dao;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import com.demo.junitmockitodemospringboot.Model.Employee;
import com.demo.junitmockitodemospringboot.Service.EmployeeService;
import com.demo.junitmockitodemospringboot.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith({ SpringExtension.class, MockitoExtension.class })
@WebMvcTest(EmployeeDAO.class)
public class EmployeeDaoTest {

    @MockBean
    EmployeeRepository repository;


    @Autowired
    EmployeeDAO dao;

    @Test
    public void testGetEmployeeById(){
        when(repository.getById(1)).thenReturn(new Employee(1,"Tony","Thomas",28,"Melbourne"));
        Employee e = dao.getEmployeeById(1);
        assertEquals("Tony", e.getFirstName());
    }
}
