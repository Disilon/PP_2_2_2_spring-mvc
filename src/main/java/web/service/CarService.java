package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarService {

    private static List<Car> cars = List.of(
            new Car("Toyota", "Red", 123),
            new Car("Nissan", "Blue", 321),
            new Car("Volkswagen", "Green", 456),
            new Car("Ford", "Yellow", 654),
            new Car("Opel", "Red", 789)
    );

    public List<Car> getCars(int numberOfCars) {
        if (numberOfCars <= 0) {
            return null;
        }
        if (numberOfCars >= 5) {
            return cars;
        }
        return cars.stream().limit(numberOfCars).toList();
    }
}
