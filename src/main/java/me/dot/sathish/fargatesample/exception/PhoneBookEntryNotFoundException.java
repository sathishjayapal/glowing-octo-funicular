package me.dot.sathish.fargatesample.exception;

public class PhoneBookEntryNotFoundException extends RuntimeException {
    public PhoneBookEntryNotFoundException(){
        super();
    }
    public PhoneBookEntryNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
