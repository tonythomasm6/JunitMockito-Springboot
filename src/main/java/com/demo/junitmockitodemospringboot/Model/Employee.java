package com.demo.junitmockitodemospringboot.Model;


import lombok.Data;

import javax.persistence.Id;

@Data
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String location;

    public Employee(int id, String firstName, String lastName, int age, String location){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.location = location;
    }

}
