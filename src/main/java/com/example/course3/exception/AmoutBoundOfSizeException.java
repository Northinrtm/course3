package com.example.course3.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AmoutBoundOfSizeException extends RuntimeException{
    public AmoutBoundOfSizeException() {
    }

    public AmoutBoundOfSizeException(String message) {
        super(message);
    }

    public AmoutBoundOfSizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public AmoutBoundOfSizeException(Throwable cause) {
        super(cause);
    }

    public AmoutBoundOfSizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
