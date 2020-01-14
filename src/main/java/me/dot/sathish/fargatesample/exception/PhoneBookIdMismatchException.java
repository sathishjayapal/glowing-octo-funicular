package me.dot.sathish.fargatesample.exception;

public class PhoneBookIdMismatchException extends RuntimeException {
    public PhoneBookIdMismatchException(){
        super();
    }
    public PhoneBookIdMismatchException(String message, Throwable cause) {
        super(message, cause);
    }
}
