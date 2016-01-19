package net.apispark.webapi.representation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class InputBodyStructuredLog_Inbound_call_Location {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

    private java.lang.String geolocation;

    
    public java.lang.String getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(java.lang.String geolocation) {
        this.geolocation = geolocation;
    }


    private java.lang.String branch;

    
    public java.lang.String getBranch() {
        return branch;
    }

    public void setBranch(java.lang.String branch) {
        this.branch = branch;
    }

}
