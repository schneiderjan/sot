package rentalresources;

import com.owlike.genson.Genson;
import java.util.ArrayList;
import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;
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
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public ArrayList<Car> getRentals() {
        return rental.getRentals();
    }

    @POST
    @Path("add")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void addRental(Car newCar) {
//        Car c = genson.deserialize(newCar, Car.class);
        rental.addRental(newCar);
//        return Response.ok().build();
    }

    @DELETE
    @Path("remove")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void removeRental(@QueryParam("index") int index) throws JSONException {
        rental.removeRental(index);
    }

    @PUT
    @Path("price")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void updatePrice(@QueryParam("index") int index, @QueryParam("newPrice") int newPrice) {
        rental.updatePrice(index, newPrice);
    }
}
