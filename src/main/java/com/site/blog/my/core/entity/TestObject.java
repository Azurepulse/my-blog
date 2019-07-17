package com.site.blog.my.core.entity;

import java.util.HashMap;

/**
 * @author ZTY
 */
public class TestObject {

    public TestObject() {
    }

    public TestObject(boolean status, String message, HashMap<String, Object> additional) {
        this.status = status;
        this.message = message;
        this.additional = additional;
    }

    private boolean status;
    private String message;
    private HashMap<String, Object> additional;

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

    public HashMap<String, Object> getAdditional() {
        return additional;
    }

    public void setAdditional(HashMap<String, Object> additional) {
        this.additional = additional;
    }
}
