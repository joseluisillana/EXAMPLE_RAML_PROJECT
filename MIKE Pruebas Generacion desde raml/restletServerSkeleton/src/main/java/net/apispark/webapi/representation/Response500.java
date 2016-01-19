package net.apispark.webapi.representation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Response500 {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

    private java.lang.String response_status;

    
    public java.lang.String getResponse_status() {
        return response_status;
    }

    public void setResponse_status(java.lang.String response_status) {
        this.response_status = response_status;
    }

}
