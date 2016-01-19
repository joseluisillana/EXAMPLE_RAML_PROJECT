package net.apispark.webapi.representation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ResponseStructuredDefault_Response_status {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

    private java.lang.String status_code;

    
    public java.lang.String getStatus_code() {
        return status_code;
    }

    public void setStatus_code(java.lang.String status_code) {
        this.status_code = status_code;
    }


    private java.lang.String status_message;

    
    public java.lang.String getStatus_message() {
        return status_message;
    }

    public void setStatus_message(java.lang.String status_message) {
        this.status_message = status_message;
    }

}
