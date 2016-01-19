package net.apispark.webapi.representation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class InputBodyStructuredLog_Inbound_call_Health {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

    private java.lang.String timestamp;

    
    public java.lang.String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(java.lang.String timestamp) {
        this.timestamp = timestamp;
    }


    private java.lang.String response_time;

    
    public java.lang.String getResponse_time() {
        return response_time;
    }

    public void setResponse_time(java.lang.String response_time) {
        this.response_time = response_time;
    }


    private java.lang.String response_code;

    
    public java.lang.String getResponse_code() {
        return response_code;
    }

    public void setResponse_code(java.lang.String response_code) {
        this.response_code = response_code;
    }


    private java.lang.String response_status;

    
    public java.lang.String getResponse_status() {
        return response_status;
    }

    public void setResponse_status(java.lang.String response_status) {
        this.response_status = response_status;
    }


    private java.lang.String http_status_code;

    
    public java.lang.String getHttp_status_code() {
        return http_status_code;
    }

    public void setHttp_status_code(java.lang.String http_status_code) {
        this.http_status_code = http_status_code;
    }

}
