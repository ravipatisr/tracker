package io.egen.service;

import io.egen.Entity.Vehicle;

import java.util.List;

public interface VehicleService {
    List<Vehicle> findAll();
    Vehicle findOne(String VIN);
    Vehicle create(Vehicle Vhi);
    Vehicle update(String VIN, Vehicle Vhi);
    void delete(String VIN);
}
