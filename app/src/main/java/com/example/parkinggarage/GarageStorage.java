package com.example.parkinggarage;

public class GarageStorage {
    private int nElems;
    private static Vehicle[] theBag;

    public GarageStorage(int maxSize) {
        theBag = new Vehicle[maxSize];
        nElems = 0;
    }

    public void insert(Vehicle v) {
        theBag[nElems++] = v;
    }
}
