/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restservice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jan
 */
public class Rental {
    List<Car> rentals;

    public Rental (){
        rentals = new ArrayList<>();
        rentals.add(new Car("Opel Astra", 100));
        rentals.add(new Car("Volkswagen Passat", 250));
        rentals.add(new Car("Volkswagen Polo", 100));
    }

    public List<Car> getRentals(){
        return rentals;
    }

    public boolean addRental(Car newRental){
       return rentals.add(newRental);
    }

    public void removeRental(int index){
        if(rentals.get(index) != null){
           rentals.remove(index);
        }
    }

    public int getPrice(int index){
        return rentals.get(index).price;
    }

    public void updatePrice(int index, int newPrice){
        rentals.get(index).price = newPrice;
    }
}
