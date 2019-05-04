package com.example.parkinggarage;

import java.io.Serializable;

public class VehicleSpace implements Serializable {
    Vehicle vehicle;
    String type;
    int distance;

    public int getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public boolean isFilled() {
        return vehicle != null;
    }
    public boolean fill(Vehicle vehicle) {
        if (type.equals("Car") || type.equals("Motorcycle")) {
            if (vehicle.getType().equals("Truck")) {
                System.out.println("Tried to fill a small spot with Truck!");
                return false;
            } else {
                this.vehicle = vehicle;
                return true;
            }
        } else {
            if (vehicle.getType().equals("Truck")) {
                this.vehicle = vehicle;
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
