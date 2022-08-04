package com.demo.junitmockitodemospringboot.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Error {

    private int errorCode;
    private String description;

    public Error(int errorCode, String description) {
        this.errorCode = errorCode;
        this.description = description;
    }
}
