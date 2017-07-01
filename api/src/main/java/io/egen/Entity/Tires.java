package io.egen.Entity;

import com.sun.corba.se.impl.io.ValueHandlerImpl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tires {

    @Id
    @Column (columnDefinition = "VARCHAR(10)")
    private String VIN;

    private String frontLeft;
    private String frontRight;
    private String rearLeft;
    private String rearRight;


    public String getFrontLeft() {
        return frontLeft;
    }

    public void setFrontLeft(String frontLeft) {
        this.frontLeft = frontLeft;
    }

    public String getFrontRight() {
        return frontRight;
    }

    public void setFrontRight(String frontRight) {
        this.frontRight = frontRight;
    }

    public String getRearLeft() {
        return rearLeft;
    }

    public void setRearLeft(String rearLeft) {
        this.rearLeft = rearLeft;
    }

    public String getRearRight() {
        return rearRight;
    }

    public void setRearRight(String rearRight) {
        this.rearRight = rearRight;
    }

    @Override
    public String toString() {
        return "Tires{" +
                "frontLeft='" + frontLeft + '\'' +
                ", frontRight='" + frontRight + '\'' +
                ", rearLeft='" + rearLeft + '\'' +
                ", rearRight='" + rearRight + '\'' +
                '}';
    }

}
