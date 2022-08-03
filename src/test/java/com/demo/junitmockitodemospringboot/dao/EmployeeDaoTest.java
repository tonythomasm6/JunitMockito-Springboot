package com.demo.junitmockitodemospringboot.dao;

import static org.junit.jupiter.api.Assertions.*;

import com.demo.junitmockitodemospringboot.Model.Employee;
import com.demo.junitmockitodemospringboot.Service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith({ SpringExtension.class, MockitoExtension.class })
@WebMvcTest(EmployeeDAO.class)
public class EmployeeDaoTest {

    @Autowired
    EmployeeDAO dao;

    @Test
    public void testGetEmployeeById(){
        Employee e = dao.getEmployeeById(1);
        assertEquals("Tony", e.getFirstName());
    }
}
