package io.egen.service;

import io.egen.Entity.Vehicle;
import io.egen.exception.BadRequestException;
import io.egen.exception.ResourceNotFoundException;
import io.egen.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepository repository;

    @Transactional(readOnly = true)
    public List<Vehicle> findAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Vehicle findOne(String VIN) {
        Vehicle existing = repository.findOne(VIN);
        if (existing == null) {
            throw new ResourceNotFoundException("Vehicle with VIN " + VIN + " doesn't exist.");
        }
        return existing;
    }

    @Transactional
    public Vehicle create(Vehicle Vhi) {
        Vehicle existing = repository.findOne(Vhi.getVIN());
        if (existing != null) {
            throw new BadRequestException("Vehicle with VIN " + Vhi.getVIN() + " already exists.");
        }
        return repository.create(Vhi);
    }

    @Transactional
    public Vehicle update(String VIN, Vehicle Vhi) {
        Vehicle existing = repository.findOne(VIN);
        if (existing == null) {
            throw new ResourceNotFoundException("Vehicle with VIN " + VIN + " doesn't exist.");
        }
        return repository.update(Vhi);
    }

    public void delete(String VIN) {
        Vehicle existing = repository.findOne(VIN);
        if (existing == null) {
            throw new ResourceNotFoundException("Vehicle with VIN " + VIN + " doesn't exist.");
        }
        repository.delete(existing);

    }
}
