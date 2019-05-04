package com.example.parkinggarage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Floor1 extends AppCompatActivity {
    public Garage garage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor1);
        generateGarage();

    }
    public void storeGarage(View view) {
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("database");
        DatabaseReference child = ref.child("data");
        child.setValue(garage);
    }

    public void generateGarage() {
        garage = new Garage();
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Truck"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Truck"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Truck"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Truck"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Truck"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Truck"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Truck"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Truck"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Truck"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Truck"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Truck"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Car"));
        garage.insert(new VehicleSpace("Truck"));
    }
}
