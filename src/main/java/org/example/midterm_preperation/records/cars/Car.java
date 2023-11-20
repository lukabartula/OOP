package org.example.midterm_preperation.records.cars;

import java.util.Arrays;
import java.util.List;

/*Implement a record named Car with attributes: registrationNumber (String),
 make (String), model (String), and mileage (double). Then, create a class named
 CarManager with a method named filterCarsByMileage, which takes a list of cars and
 a maximum mileage, and returns a new list containing only the cars with a mileage
 less than or equal to the specified maximum.
 */

record Car (String registrationNum, String make, String model, double mileage){}

class CarManager{

    public static List<Car> filterByMileage(List<Car> cars, double maxMileage){
        return cars.stream()
                .filter(car -> car.mileage()<=maxMileage)
                .toList();
    }
}

class Main{
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car ("12345A1", "Ford", "Escort", 223433.5),
                new Car ("235234C", "Ferrari", "LaFerrari", 1023.6),
                new Car ("A61E343", "Peugeot", "206", 257178.9),
                new Car ("24345E4", "Golf", "Mk6", 1234023.6)
        );

        System.out.println(
                CarManager.filterByMileage(cars, 500000)
        );
    }
}