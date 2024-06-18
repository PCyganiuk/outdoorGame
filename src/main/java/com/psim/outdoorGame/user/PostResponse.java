package com.psim.outdoorGame.user;

public class PostResponse {
    private String message;

    public PostResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
