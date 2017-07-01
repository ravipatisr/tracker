package io.egen.repository;

import io.egen.Entity.Vehicle;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class VehicleRepositoryImpl implements VehicleRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Vehicle> findAll() {
        TypedQuery<Vehicle> query = entityManager.createNamedQuery("Vehicle.findAll",
                Vehicle.class);
        return query.getResultList();
    }

    public Vehicle findOne(String VIN) {
        return entityManager.find(Vehicle.class, VIN);
    }

    public Vehicle create(Vehicle Vhi) {
        entityManager.persist(Vhi);
        return Vhi;
    }

    public Vehicle update(Vehicle Vhi) {
        return entityManager.merge(Vhi);
    }

    public void delete(Vehicle Vhi) {
        entityManager.remove(Vhi);

    }


}
