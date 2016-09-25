package rentalresources;

import com.owlike.genson.Genson;
import com.sun.jersey.json.impl.JSONHelper;
import com.sun.jersey.spi.resource.Singleton;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
    @Consumes(MediaType.APPLICATION_JSON)
    public void removeRental(@QueryParam("JSON") int js) throws JSONException {
        JSONObject json = new JSONObject(js);
        int index = json.getInt("index");
        rental.removeRental(index);
    }

    @PUT
    @Path("price")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updatePrice(@QueryParam("JSON") String pi) throws JSONException {
        JSONObject json = new JSONObject(pi);
        System.out.println(json.toString());
        int index = json.getInt("index");
        int newPrice = json.getInt("newPrice");
        rental.updatePrice(index, newPrice);
    }
}
