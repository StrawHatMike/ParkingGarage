package com.example.parkinggarage;

import java.io.Serializable;
import java.util.Date;

public class Vehicle implements Serializable {
    String type;
    String licenseplate;
    Date date;
    String attendant;

    public String getAttendant() {
        return attendant;
    }

    public void setAttendant(String attendant) {
        this.attendant = attendant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    Vehicle() {
        type = "Car";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    Vehicle(String type) {
        switch (type) {
            case "Car": this.type = type; break;
            case "Truck": this.type = type; break;
            case "Motorcycle": this.type = type; break;
            default: type = "Car"; System.err.println("Warning: Mistyped argument, defaulting to Car.");
        }
        this.type = type;
    }
}
