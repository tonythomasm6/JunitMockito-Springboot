package com.demo.junitmockitodemospringboot.data;

import com.demo.junitmockitodemospringboot.Model.Employee;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class Data {
    Employee tony = new Employee(1,"Tony","Thomas",28, "Melbourne");
    Employee nila = new Employee(2,"Nila","Manoj",26, "Mumbai");
    Employee thanseeh = new Employee(3,"Thanseeh","BH",29, "Dubai");
    Employee cyriac = new Employee(4,"Cyriac","Thomas",22, "ACT");

    ArrayList<Employee> allEmployees = new ArrayList<>();

//    @PostConstruct
//    public void init(){
//        allEmployees.add(tony);
//        allEmployees.add(nila);
//        allEmployees.add(thanseeh);
//        allEmployees.add(cyriac);
//    }

    public List<Employee> getAllEmployees(){
        allEmployees.add(tony);
        allEmployees.add(nila);
        allEmployees.add(thanseeh);
        allEmployees.add(cyriac);
        return allEmployees;
    }
}
