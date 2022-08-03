package com.demo.junitmockitodemospringboot.service;

import com.demo.junitmockitodemospringboot.Model.Employee;
import com.demo.junitmockitodemospringboot.Service.EmployeeService;
import com.demo.junitmockitodemospringboot.dao.EmployeeDAO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.when;


@ExtendWith({ SpringExtension.class, MockitoExtension.class })
@WebMvcTest(EmployeeService.class)
public class EmployeeServiceTest {

    @MockBean
    EmployeeDAO dao;

    @Autowired
    EmployeeService service;

    @Test
    public void testGetEmployeeById(){
        when(dao.getEmployeeById(1)).thenReturn(new Employee(1,"Tony","Thomas",28, "Melbourne"));
        Employee e = service.getEmployeeById(1);
        assertEquals("Tony", e.getFirstName());
    }
}
