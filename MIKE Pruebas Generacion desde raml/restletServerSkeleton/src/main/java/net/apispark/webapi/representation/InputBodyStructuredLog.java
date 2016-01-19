package net.apispark.webapi.representation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class InputBodyStructuredLog {
    /** Default serial version ID. */
    private static final long serialVersionUID = 1L;

    private java.lang.String uuaa;

    
    public java.lang.String getUuaa() {
        return uuaa;
    }

    public void setUuaa(java.lang.String uuaa) {
        this.uuaa = uuaa;
    }


    private java.lang.String srv_id;

    
    public java.lang.String getSrv_id() {
        return srv_id;
    }

    public void setSrv_id(java.lang.String srv_id) {
        this.srv_id = srv_id;
    }


    private java.lang.String srv_href;

    
    public java.lang.String getSrv_href() {
        return srv_href;
    }

    public void setSrv_href(java.lang.String srv_href) {
        this.srv_href = srv_href;
    }


    private java.util.List<java.lang.String> outbound_calls;

    
    
    public java.util.List<java.lang.String> getOutbound_calls() {
        if (outbound_calls == null) {
            outbound_calls = new ArrayList<java.lang.String>();
        }
        return outbound_calls;
    }

    public void setOutbound_calls(java.util.List<java.lang.String> outbound_calls) {
        this.outbound_calls = outbound_calls;
    }


    private java.lang.String schema_version;

    
    public java.lang.String getSchema_version() {
        return schema_version;
    }

    public void setSchema_version(java.lang.String schema_version) {
        this.schema_version = schema_version;
    }


    private java.lang.String srv_type;

    
    public java.lang.String getSrv_type() {
        return srv_type;
    }

    public void setSrv_type(java.lang.String srv_type) {
        this.srv_type = srv_type;
    }


    private java.lang.String inbound_call;

    
    public java.lang.String getInbound_call() {
        return inbound_call;
    }

    public void setInbound_call(java.lang.String inbound_call) {
        this.inbound_call = inbound_call;
    }

}
