package rentalresources;

import com.sun.jersey.spi.resource.Singleton;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import restservice.Car;
import restservice.Rental;        
/**
 * Created by jan on 17.09.2016.
 */
@Path("/rental")
@Singleton
public class RentalResources {
    private final Rental rental;

    public RentalResources(){
        rental = new Rental();
    }

    @GET
    @Path("rentals")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Car> getRentals(){
        return rental.getRentals();
    }
    
    @POST
    @Path("add")
    @Produces(MediaType.APPLICATION_JSON)
    public void addRental(String name, int price){
        rental.addRental(new Car(name,price));
    }

    @DELETE
    @Path("remove")
    @Produces(MediaType.APPLICATION_JSON)
    public void removeRental(int index){
        rental.removeRental(index);
    }

    @GET//MUST BE POST probably
    @Path("price")
    @Produces(MediaType.APPLICATION_JSON)
    public int getPrice(int index){
        return rental.getPrice(index);
    }

    @PUT
    @Path("price")
    @Produces(MediaType.APPLICATION_JSON)
    public void updatePrice(int index, int newPrice){
         rental.updatePrice(index, newPrice);
    }
}
