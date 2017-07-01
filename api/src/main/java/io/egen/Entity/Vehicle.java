package io.egen.Entity;

import javax.persistence.*;

@Entity
@NamedQueries({
                @NamedQuery(name = "Vehicle.findAll",
                            query = "SELECT Vhi FROM Vehicle Vhi ORDER BY Vhi.VIN DESC"),
            })

public class Vehicle {


    @Id
    @Column (columnDefinition = "VARCHAR(36)")
    private String  VIN;

    private String Make;
    private String Model;
    private String Year;
    private String RedlineRPM;
    private String MaxFuelVolume;
    private String LastServiceDate;
    private String longitude;
    private String latitude;
    private String timestamp;
    private String fuelVolume;
    private String speed;
    private String engineHp;
    private String checkEngineLightOn;
    private String engineCoolantLow;
    private String cruiseControlOn;
    private String engineRpm;


    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getRedlineRPM() {
        return RedlineRPM;
    }

    public void setRedlineRPM(String redlineRPM) {
        RedlineRPM = redlineRPM;
    }

    public String getMaxFuelVolume() {
        return MaxFuelVolume;
    }

    public void setMaxFuelVolume(String maxFuelVolume) {
        MaxFuelVolume = maxFuelVolume;
    }

    public String getLastServiceDate() {
        return LastServiceDate;
    }

    public void setLastServiceDate(String lastServiceDate) {
        LastServiceDate = lastServiceDate;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(String fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getEngineHp() {
        return engineHp;
    }

    public void setEngineHp(String engineHp) {
        this.engineHp = engineHp;
    }

    public String getCheckEngineLightOn() {
        return checkEngineLightOn;
    }

    public void setCheckEngineLightOn(String checkEngineLightOn) {
        this.checkEngineLightOn = checkEngineLightOn;
    }

    public String getEngineCoolantLow() {
        return engineCoolantLow;
    }

    public void setEngineCoolantLow(String engineCoolantLow) {
        this.engineCoolantLow = engineCoolantLow;
    }

    public String getCruiseControlOn() {
        return cruiseControlOn;
    }

    public void setCruiseControlOn(String cruiseControlOn) {
        this.cruiseControlOn = cruiseControlOn;
    }

    public String getEngineRpm() {
        return engineRpm;
    }

    public void setEngineRpm(String engineRpm) {
        this.engineRpm = engineRpm;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VIN='" + VIN + '\'' +
                ", Make='" + Make + '\'' +
                ", Model='" + Model + '\'' +
                ", Year='" + Year + '\'' +
                ", RedlineRPM='" + RedlineRPM + '\'' +
                ", MaxFuelVolume='" + MaxFuelVolume + '\'' +
                ", LastServiceDate='" + LastServiceDate + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", fuelVolume='" + fuelVolume + '\'' +
                ", speed='" + speed + '\'' +
                ", engineHp='" + engineHp + '\'' +
                ", checkEngineLightOn='" + checkEngineLightOn + '\'' +
                ", engineCoolantLow='" + engineCoolantLow + '\'' +
                ", cruiseControlOn='" + cruiseControlOn + '\'' +
                ", engineRpm='" + engineRpm + '\'' +
                '}';
    }

    public void setTires(Tires tires) {
    }
}
