package net.apispark.webapi.representation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class ResponseGetStructuredLog_Response_body_Inbound_call_Cms {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

    private java.lang.String service;

    
    public java.lang.String getService() {
        return service;
    }

    public void setService(java.lang.String service) {
        this.service = service;
    }


    private java.lang.String channel;

    
    public java.lang.String getChannel() {
        return channel;
    }

    public void setChannel(java.lang.String channel) {
        this.channel = channel;
    }


    private java.lang.String medium;

    
    public java.lang.String getMedium() {
        return medium;
    }

    public void setMedium(java.lang.String medium) {
        this.medium = medium;
    }

}
