package com.key.licence.Core.utils;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jrafa on 2/5/2018.
 */
public class Response {
    private Boolean status;
    private String message;
    private Object data;

    public Response(Boolean status, String message, Object data) {
        this.status = status || Boolean.FALSE;
        this.message = message == null ? "Obs ocurred some problem" : message;
        this.data = data == null ? new ArrayList<>() : data;
    }

    public Boolean isStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
