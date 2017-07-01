package io.egen.Controller;

import io.egen.Entity.Vehicle;
import io.egen.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "Vehicle")
public class VehicleController {

    @Autowired
    VehicleService service;
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List <Vehicle> findAll(){
        return service.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "{VIN}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Vehicle findOne(@PathVariable("VIN")String VhiId){
        return service.findOne(VhiId);
    }

    @RequestMapping(method = RequestMethod.POST ,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Vehicle create(@RequestBody Vehicle Vhi){
        return service.create(Vhi);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "{VIN}",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Vehicle update(@PathVariable("VIN") String VhiId, @RequestBody Vehicle Vhi) {
        return service.update(VhiId, Vhi);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "{VIN}")
    public void delete(@PathVariable("VIN") String VhiId){
        service.delete(VhiId);
    }
}
