package ru.legas.course.spring.rest.exception_handler;

public class NoSuchEmployeeException extends RuntimeException{
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
