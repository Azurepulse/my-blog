package com.site.blog.my.core.entity;

import java.util.HashMap;

public class TestObject {
    public TestObject() {

    }

    public TestObject(boolean status, String message, HashMap<String,Object> additonal) {
        this.status = status;
        this.message = message;
        this.additonal = additonal;
    }

    private boolean status;
    private String message;
    private HashMap<String,Object> additonal;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HashMap<String,Object> getAdditonal() {
        return additonal;
    }

    public void setAdditonal(HashMap<String,Object> additonal) {
        this.additonal = additonal;
    }
}
