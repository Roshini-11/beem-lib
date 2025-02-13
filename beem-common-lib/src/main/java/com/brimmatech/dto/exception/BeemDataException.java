package com.brimmatech.dto.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BeemDataException extends RuntimeException{
    private String message;
    public BeemDataException(String message){
        super();
        this.message = message;
    }
    public BeemDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
