package com.site.blog.my.core.entity;

import java.util.Map;

public class TestObject {
    public TestObject() {

    }

    public TestObject(boolean status, String message, Map additonal) {
        this.status = status;
        this.message = message;
        this.additonal = additonal;
    }

    private boolean status;
    private String message;
    private Map additonal;

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

    public Map getAdditonal() {
        return additonal;
    }

    public void setAdditonal(Map additonal) {
        this.additonal = additonal;
    }
}
