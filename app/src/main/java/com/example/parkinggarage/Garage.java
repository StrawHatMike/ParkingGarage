package com.example.parkinggarage;

import java.io.Serializable;
import java.util.ArrayList;

public class Garage implements Serializable {
    private int nSize;
    private int cur;
    private int distanceCounter;
    private ArrayList<VehicleSpace> arr;

    public ArrayList<VehicleSpace> getArr() {
        return arr;
    }

    public void setArr(ArrayList<VehicleSpace> arr) {
        this.arr = arr;
    }

    public void insert(VehicleSpace v) {
        v.setDistance(++distanceCounter);
        arr.add(v);
    }

    Garage() {
        nSize = 105;
        arr = new ArrayList<VehicleSpace>(nSize);
        cur = 0;
    }

    public int getnSize() {
        return nSize;
    }

    public void setnSize(int nSize) {
        this.nSize = nSize;
        distanceCounter = 0;
    }

    Garage(int nSize) {
        this.nSize = nSize;
        arr = new ArrayList<VehicleSpace>(nSize);
        cur = 0;
        distanceCounter = 0;
    }

    public void display() {
        for (int i = 0; i < nSize; i++) {
            if (i < arr.size()) {
                System.out.println(arr.get(i).toString());
            }
        }
    }

    public void insertCar(Vehicle v) {
        for (int i = 0; i < nSize; i++) {
            if (arr.get(i) != null) {
                if (!arr.get(i).isFilled()) {
                    if (arr.get(i).fill(v)) {

                        cur++;
                        return;
                    } else {
                    }
                }
            }
        }
        System.err.println("Warning: Could not find an open spot!");
    }
}
