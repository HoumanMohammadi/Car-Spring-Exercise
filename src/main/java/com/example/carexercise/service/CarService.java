package com.example.carexercise.service;

import com.example.carexercise.model.Car;
import com.example.carexercise.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void addCar(Car car){
        carRepository.addCar(car);
    }

    public List<Car> getCars(){
        return carRepository.getCars();
    }
}
