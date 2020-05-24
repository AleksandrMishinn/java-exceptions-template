package com.epam.izh.rd.online.exception;

public class NotCorrectPasswordException extends Exception{
    public NotCorrectPasswordException() {
        super();
    }

    public NotCorrectPasswordException(String message) {
        super(message);
    }

    public NotCorrectPasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotCorrectPasswordException(Throwable cause) {
        super(cause);
    }

    protected NotCorrectPasswordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
