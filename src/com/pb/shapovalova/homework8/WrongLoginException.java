package com.pb.shapovalova.homework8;

public class WrongLoginException extends RuntimeException {

    public WrongLoginException() {
    }

    public WrongLoginException (String messageLogin) {
        super(messageLogin);
    }
}
