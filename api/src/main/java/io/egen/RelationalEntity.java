package io.egen;

import io.egen.Entity.Tires;
import io.egen.Entity.Vehicle;
import javafx.scene.input.KeyCode;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.swing.text.html.HTML;
import java.util.List;

public class RelationalEntity {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Auto-Tracker");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        INSERT

        Vehicle Vhi = new Vehicle();
        Vhi.setVIN("1HGCR2F3XFA027534");
        Vhi.setMake("HONDA");
        Vhi.setModel("ACCORD");
        Vhi.setYear("2015");
        Vhi.setRedlineRPM("5500");
        Vhi.setLastServiceDate("2017-05-25");
        Vhi.setMaxFuelVolume("15");
        Vhi.setCheckEngineLightOn("false");
        Vhi.setLatitude("-88.144406");
        Vhi.setLongitude("41.803194");
        Vhi.setTimestamp("2017-05-25");
        Vhi.setFuelVolume("1.5");
        Vhi.setSpeed("85");
        Vhi.setEngineHp("250");
        Vhi.setEngineCoolantLow("true");
        Vhi.setCruiseControlOn("true");
        Vhi.setEngineRpm("6300");

        Tires tires = new Tires();
        tires.setFrontLeft("34");
        tires.setFrontRight("36");
        tires.setRearLeft("36");
        tires.setRearRight("32");
        entityManager.getTransaction()
                     .begin();
        entityManager.persist(tires);
        Vhi.setTires(tires);
        entityManager.persist(Vhi);
        entityManager.getTransaction()
                     .commit();

//        FIND BY ID

//        Vehicle Vhi  = entityManager.find(Vehicle.class, "1HGCR2F3XFA027534");//
//        System.out.println(Vhi);

        //UPDATE

//        Vehicle Vhi = entityManager.find(Vehicle.class, "1HGCR2F3XFA027534");
//
//        Vhi.setVIN("1HGCR2F3XFA027534");
//
//        entityManager.getTransaction().begin();
//        entityManager.merge(Vhi);
//        entityManager.getTransaction().commit();

        //DELETE

//        Vehicle Vhi = entityManager.find(Vehicle.class, "1HGCR2F3XFA027534");
//
//        entityManager.getTransaction().begin();
//        entityManager.remove(Vhi);
//        entityManager.getTransaction().commit();

        //FINAL ALL

//        TypedQuery<Vehicle> query = entityManager.createQuery("SELECT Vhi FROM Vehicle Vhi ORDER BY VIN DESC",
//                                                               Vehicle.class);
//        List<Vehicle> resultList = query.getResultList();
//        for (Vehicle Vhi : resultList) {
//            System.out.println(Vhi);
//        }
//





        entityManager.close();

        entityManagerFactory.close();

    }
}
