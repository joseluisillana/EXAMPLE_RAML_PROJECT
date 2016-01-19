package net.apispark.webapi.resource;

import org.restlet.resource.Get;
import org.restlet.resource.Post;
import java.util.UUID;
import org.restlet.resource.Options;
import org.restlet.representation.Representation;
public interface LogStructuredResource {

    @Get
    net.apispark.webapi.representation.ResponseGetStructuredLog represent() throws Exception;

    @Post
    net.apispark.webapi.representation.Response201 add(net.apispark.webapi.representation.InputBodyStructuredLog bean) throws Exception;

}

