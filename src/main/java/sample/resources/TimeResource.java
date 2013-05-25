package sample.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import sample.models.Time;

/**
 *
 * @author t.endo
 */
@Path("/time")
@Produces(MediaType.APPLICATION_JSON)
public class TimeResource {

    @GET
    public Time get() {
        return new Time();
    }
}
