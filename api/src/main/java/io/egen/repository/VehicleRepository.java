package io.egen.repository;

import io.egen.Entity.Vehicle;

import java.util.List;

public interface VehicleRepository {
    List<Vehicle> findAll();
    Vehicle findOne(String VIN);
    Vehicle create(Vehicle Vhi);
    Vehicle update (Vehicle Vhi);
    void delete(Vehicle Vhi);

}
