package com.example.carexercise.repository;

import com.example.carexercise.model.Car;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarRepository {

    private final List<Car> cars;

    public CarRepository(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars(){
        return cars;
    }

    public void addCar(Car carToAdd){
        cars.add(carToAdd);
    }
}
