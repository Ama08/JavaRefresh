package org.optionals;

public class MissingMemoryException extends RuntimeException {
    public MissingMemoryException(String message) {
        super(message);
    }
}
