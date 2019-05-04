package com.example.parkinggarage;

import java.io.Serializable;

public class Vehicle implements Serializable {
    String type;

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
