package com.demo.junitmockitodemospringboot.controller;

import static org.junit.jupiter.api.Assertions.*;
import com.demo.junitmockitodemospringboot.Model.Employee;
import com.demo.junitmockitodemospringboot.Service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private EmployeeService employeeService;

    @Test
    public void testGetEmployeeById() throws Exception {

        when(employeeService.getEmployeeById(1)).thenReturn( new Employee(1,"Tony","Thomas",28, "Melbourne"));
        MvcResult result = (MvcResult) mvc.perform( MockMvcRequestBuilders
                        .get("/employee/getById")
                        .param("id","1")
                        .accept(MediaType.ALL))
                        .andDo(print())
                        .andExpect(status().isOk())
                        .andReturn();

        String empResult = result.getResponse().getContentAsString();
        Employee emp = new Employee(1,"Tony","Thomas",28, "Melbourne");

        assertTrue(empResult.contains(emp.getFirstName()));
        assertTrue(empResult.contains(emp.getLastName()));
        assertTrue(empResult.contains(emp.getLocation()));
        assertTrue(empResult.contains(String.valueOf(emp.getAge())));

    }
}
