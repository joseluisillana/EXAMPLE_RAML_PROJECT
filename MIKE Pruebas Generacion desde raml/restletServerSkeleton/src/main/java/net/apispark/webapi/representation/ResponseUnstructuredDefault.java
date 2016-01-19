package net.apispark.webapi.representation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ResponseUnstructuredDefault {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

    private java.util.List<java.lang.String> response_body;

    
    
    public java.util.List<java.lang.String> getResponse_body() {
        if (response_body == null) {
            response_body = new ArrayList<java.lang.String>();
        }
        return response_body;
    }

    public void setResponse_body(java.util.List<java.lang.String> response_body) {
        this.response_body = response_body;
    }


    private java.lang.String response_status;

    
    public java.lang.String getResponse_status() {
        return response_status;
    }

    public void setResponse_status(java.lang.String response_status) {
        this.response_status = response_status;
    }

}
