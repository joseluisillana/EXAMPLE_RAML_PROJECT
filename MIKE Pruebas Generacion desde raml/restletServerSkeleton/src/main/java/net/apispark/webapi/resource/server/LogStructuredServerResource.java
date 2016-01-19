package net.apispark.webapi.resource.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.restlet.data.Reference;
import org.restlet.data.MediaType;
import org.restlet.data.Status;
import org.restlet.data.Preference;
import org.restlet.data.ChallengeScheme;
import org.restlet.data.Header;
import org.restlet.engine.header.HeaderConstants;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.representation.EmptyRepresentation;
import org.restlet.representation.ObjectRepresentation;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;
import org.restlet.util.Series;
import java.util.logging.Level;

import net.apispark.webapi.resource.LogStructuredResource;
import net.apispark.webapi.utils.QueryParameterUtils;
import net.apispark.webapi.utils.PathVariableUtils;

public class LogStructuredServerResource extends AbstractServerResource implements LogStructuredResource {

    // Define allowed roles for the method "get".
    private static final String[] get1AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get1DeniedGroups = new String[] {};

    public net.apispark.webapi.representation.ResponseGetStructuredLog represent() throws Exception {
       net.apispark.webapi.representation.ResponseGetStructuredLog result = null;
        checkGroups(get1AllowedGroups, get1DeniedGroups);
        

        try {
		
        // Query parameters
        
        	
	    result = new net.apispark.webapi.representation.ResponseGetStructuredLog();
	    
	    // Initialize here your bean
         } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }
    
        return result;
    }

    // Define allowed roles for the method "post".
    private static final String[] post2AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "post".
    private static final String[] post2DeniedGroups = new String[] {};

    public net.apispark.webapi.representation.Response201 add(net.apispark.webapi.representation.InputBodyStructuredLog bean) throws Exception {
       net.apispark.webapi.representation.Response201 result = null;
        checkGroups(post2AllowedGroups, post2DeniedGroups);
        
    	if (bean==null) {
    		throw new ResourceException(Status.CLIENT_ERROR_BAD_REQUEST);
    	}

        try {
		
        // Query parameters
        
        	
	    result = new net.apispark.webapi.representation.Response201();
	    
	    // Initialize here your bean
         } catch (Exception ex) {
            // In a real code, customize handling for each type of exception
            getLogger().log(Level.WARNING, "Error when executing the method", ex);
            throw new ResourceException(Status.SERVER_ERROR_INTERNAL,
                    ex.getMessage(), ex);
        }
    
        return result;
    }


}

