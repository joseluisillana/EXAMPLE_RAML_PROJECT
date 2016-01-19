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

import net.apispark.webapi.resource.LogUnstructuredResource;
import net.apispark.webapi.utils.QueryParameterUtils;
import net.apispark.webapi.utils.PathVariableUtils;

public class LogUnstructuredServerResource extends AbstractServerResource implements LogUnstructuredResource {

    // Define allowed roles for the method "get".
    private static final String[] get3AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "get".
    private static final String[] get3DeniedGroups = new String[] {};

    public net.apispark.webapi.representation.ResponseGetUnstructuredLog represent() throws Exception {
       net.apispark.webapi.representation.ResponseGetUnstructuredLog result = null;
        checkGroups(get3AllowedGroups, get3DeniedGroups);
        

        try {
		
        // Query parameters
        
        	
	    result = new net.apispark.webapi.representation.ResponseGetUnstructuredLog();
	    
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
    private static final String[] post4AllowedGroups = new String[] {"anyone"};
    // Define denied roles for the method "post".
    private static final String[] post4DeniedGroups = new String[] {};

    public net.apispark.webapi.representation.Response201 add(net.apispark.webapi.representation.InputBodyUnstructuredLog bean) throws Exception {
       net.apispark.webapi.representation.Response201 result = null;
        checkGroups(post4AllowedGroups, post4DeniedGroups);
        
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

