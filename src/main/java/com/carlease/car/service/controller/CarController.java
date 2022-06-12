package com.carlease.car.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carlease.car.service.entity.Car;
import com.carlease.car.service.service.CarService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1/cars")
public class CarController {

  @Autowired
  private CarService carService;

  @GetMapping("/")
  public List<Car> getAllCars() {
    return carService.findAllCars();
  }

  @PostMapping("/")
  public Car saveCar(@RequestBody Car car) {
    log.info("Inside saveCar method of CarController");
    return carService.saveCar(car);
  }

  @GetMapping("/{id}")
  public Car getCarById(@PathVariable("id") @Validated Long carId) {
    log.info("Inside getCarById method of CarController");
    return carService.findByCarId(carId);
  }

}
