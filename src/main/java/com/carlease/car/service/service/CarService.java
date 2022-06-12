package com.carlease.car.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlease.car.service.entity.Car;
import com.carlease.car.service.repository.CarRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CarService {

  @Autowired
  private CarRepository carRepository;

  public Car saveCar(final Car car) {
    log.info("Inside saveCar method of CarService");
    return carRepository.save(car);
  }

  public Car findByCarId(final Long carId) {
    log.info("Inside findByCarId method of CarService");
    return carRepository.findById(carId).get();
  }

  public List<Car> findAllCars() {
    return carRepository.findAll();
  }
}
