package com.api.assignment_project;

public class ServerNotFoundException extends RuntimeException {
    ServerNotFoundException(String id) {
        super("Server not found: " + id);
    }
}
