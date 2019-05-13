package com.example.parkinggarage;

import java.io.Serializable;
import java.util.Date;

public class VehicleSpace implements Serializable {
    Vehicle vehicle;
    String type;
    int distance;
    String licensecopy;
    String namecopy;
    String typecopy;
    Date datecopy;

    public String getNamecopy() {
        return namecopy;
    }

    public void setNamecopy(String namecopy) {
        this.namecopy = namecopy;
    }

    public String getTypecopy() {
        return typecopy;
    }

    public void setTypecopy(String typecopy) {
        this.typecopy = typecopy;
    }

    public Date getDatecopy() {
        return datecopy;
    }

    public void setDatecopy(Date datecopy) {
        this.datecopy = datecopy;
    }

    public String getLicensecopy() {
        return licensecopy;
    }

    public void setLicensecopy(String licensecopy) {
        this.licensecopy = licensecopy;
    }

    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public boolean isFilled() {
        return vehicle != null;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean fill(Vehicle vehicle) {
        if (type.equals("Car") || type.equals("Motorcycle")) {
            if (vehicle.getType().equals("Truck")) {
                System.out.println("Tried to fill a small spot with Truck!");
                return false;
            } else {
                this.vehicle = vehicle;
                licensecopy = vehicle.licenseplate;
                namecopy = vehicle.attendant;
                datecopy = vehicle.date;
                typecopy = vehicle.type;
                return true;
            }
        } else {
            if (vehicle.getType().equals("Truck")) {
                this.vehicle = vehicle;
                licensecopy = vehicle.licenseplate;
                namecopy = vehicle.attendant;
                datecopy = vehicle.date;
                typecopy = vehicle.type;
                return true;
            } else {
                System.out.println("Tried to fill a big spot with Car or Motorcycle!");
                return false;
            }
        }
    }

    public void empty() {
        vehicle = null;
    }

    VehicleSpace() {
        type = "Car";
        distance = 0;
    }

    VehicleSpace(String type) {
        switch (type) {
            case "Car": this.type = type; break;
            case "Truck": this.type = type; break;
            case "Motorcycle": this.type = type; break;
            default: type = "Car"; System.err.println("Warning: Mistyped argument, defaulting to Car.");
        }
        distance = 0;

    }

    @Override
    public String toString() {
        return "[VehicleSpace] Type: " + type + " | isFilled: " + isFilled() + " | distance: " + distance;
    }
}
