package josemyduarte.io;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/greet")
@Consumes(MediaType.APPLICATION_JSON)
public class GreetingResource {

    @GET
    @Path("/hi")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello jaxrs";
    }

    @POST
    @Path("/bye")
    @Produces(MediaType.APPLICATION_JSON)
    public String bye(final String name) {
        return "{\"message\":\"bye " + name + "\"}";
    }
}
