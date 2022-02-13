package com.devsuperior.clients.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -3186776649084803811L;

    public ResourceNotFoundException(String msg) {
        super(msg);
    }
}
