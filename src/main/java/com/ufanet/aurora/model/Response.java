package com.ufanet.aurora.model;

import org.springframework.http.HttpStatus;
import java.util.Date;

public class Response {

    private Date timestamp;
    private String message;
    private HttpStatus status;
    private Object data;

    public Response() {
    }

    public Response(String message) {
        this.timestamp = new Date();
        this.message = message;
    }

    public Response(String message, HttpStatus status) {
        this.timestamp = new Date();
        this.message = message;
        this.status = status;
    }

    public Response(String message, HttpStatus status, Object data) {
        this.timestamp = new Date();
        this.message = message;
        this.status = status;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
