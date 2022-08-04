package com.demo.junitmockitodemospringboot.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeException extends  RuntimeException{

    private final int errorCode;
    private final String description;

    public EmployeeException(int errorCode, String description){
        this.errorCode = errorCode;
        this.description = description;
    }

}
