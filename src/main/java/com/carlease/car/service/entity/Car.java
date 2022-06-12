package com.carlease.car.service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long carId;
  private String make;
  private String model;
  private String version;
  private int numberOfDoors;
  private int co2Emission;
  private Long grossPrice;
  private Long netPrice;

}
