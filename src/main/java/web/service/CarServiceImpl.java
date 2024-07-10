package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private static List<Car> cars = java.util.List.of(
            new Car("Toyota", "Red", 123),
            new Car("Nissan", "Blue", 321),
            new Car("Volkswagen", "Green", 456),
            new Car("Ford", "Yellow", 654),
            new Car("Opel", "Red", 789)
    );


    @Override
    public List<Car> getCars(int numberOfCars) {
        if (numberOfCars <= 0) {
            return new ArrayList<>();
        }
        return CarServiceImpl.cars.stream().limit(numberOfCars).toList();
    }
}
