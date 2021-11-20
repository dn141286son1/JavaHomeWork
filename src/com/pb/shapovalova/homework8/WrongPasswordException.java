package com.pb.shapovalova.homework8;

public class WrongPasswordException extends RuntimeException{

    public WrongPasswordException() {
    }

    public WrongPasswordException (String messagePassword) {
        super(messagePassword);
    }
}
