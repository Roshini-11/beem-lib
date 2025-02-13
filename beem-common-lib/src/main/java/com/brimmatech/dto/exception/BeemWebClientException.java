package com.brimmatech.dto.exception;

public class BeemWebClientException extends BeemDataException {
    public BeemWebClientException(String message) {
        super(message);
    }

    public BeemWebClientException(String message, Throwable cause) {
        super(message, cause);
    }
}
