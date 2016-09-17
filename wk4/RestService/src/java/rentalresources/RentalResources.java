package rentalresources;

import restservice.Car;
import restservice.Rental;
/**
 * Created by jan on 17.09.2016.
 */
@Path("/rental")
@Singleton
public class RentalResources {
    private Rental rental;

    public RentalResources(){
        rental = new Rental();
    }

    public boolean addRental(String name, int price){
        return rental.addRental(new Car(name,price));
    }

    public void removeRental(int index){
        rental.removeRental(index);
    }

    public int getPrice(int index){
        return rental.getPrice(index);
    }

    public void updatePrice(int index, int newPrice){
         rental.updatePrice(index, newPrice);
    }
}
