package com.example.carexercise.controller;

import com.example.carexercise.model.Car;
import com.example.carexercise.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping

    public List<Car> getCars(){
        return carService.getCars();
    }

    @PostMapping
    public void addCars(@RequestBody Car carsToAdd){
        carService.addCar(carsToAdd);
    }

}
