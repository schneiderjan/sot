package rentalresources;

import com.owlike.genson.Genson;
import com.sun.jersey.spi.resource.Singleton;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import restservice.Car;
import restservice.Rental;

/**
 * Created by jan on 17.09.2016.
 */
@Path("/rental")
@Singleton
public class RentalResources {

    Genson genson = new Genson();

    private final Rental rental;

    public RentalResources() {
        rental = new Rental();
    }

    @GET
    @Path("rentals")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Car> getRentals() {
        return rental.getRentals();
    }

    @POST
    @Path("add")
    @Produces(MediaType.APPLICATION_JSON)
    public Response addRental(@QueryParam("JSON") String newCar) {
        Car c = genson.deserialize(newCar, Car.class);
        rental.addRental(c);
        return Response.ok().build();
    }

    @DELETE
    @Path("remove")
    @Produces(MediaType.APPLICATION_JSON)
    public void removeRental(@QueryParam("JSON") String index) {
       int index = genson.deserializeInto(index, Integer.class);
    //        rental.removeRental(index);
    }

    @PUT
    @Path("price")
    @Produces(MediaType.APPLICATION_JSON)
    public void updatePrice(int index, int newPrice) {
        rental.updatePrice(index, newPrice);
    }
}
