package com.example.parkinggarage;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Date;

public class Floor1 extends AppCompatActivity {
    public static Garage garage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        generateGarage();
        setContentView(R.layout.activity_floor1);
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("database");
        DatabaseReference child = ref.child("data");
        ValueEventListener changeListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                garage = dataSnapshot.getValue(Garage.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        child.addValueEventListener(changeListener);
    }


    public void storeGarage(View view) {
        setContentView(R.layout.activity_attendant);
        startActivity(new Intent(Floor1.this, AttendantActivity.class));
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
