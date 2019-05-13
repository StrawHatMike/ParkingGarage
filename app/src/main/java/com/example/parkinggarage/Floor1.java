package com.example.parkinggarage;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Date;

public class Floor1 extends AppCompatActivity {
    public static Garage garage;
    ImageView image2, image3, image4, image5,image6, image7, image8, image9, image10, image11, image12, image13, image14, image15, image16, image17, image18, image19, image20, image21, image22, image23, image24, image25, image26, image27, image28, image29, image30, image31, image32, image33, image34, image35, image36;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        generateGarage();
        setContentView(R.layout.activity_floor1);
        initializeImages();
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference("database");
        DatabaseReference child = ref.child("data");
        ValueEventListener changeListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                garage = dataSnapshot.getValue(Garage.class);
                showVehicle();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        child.addValueEventListener(changeListener);
    }

    public void showVehicle() {
        if(garage.getArr().get(0).isFilled()) {
            image2.setVisibility(View.VISIBLE);
            if(garage.getArr().get(0).getTypecopy().equals("Motorcycle")) {
                image2.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(1).isFilled()) {
            image3.setVisibility(View.VISIBLE);
        }
        if(garage.getArr().get(2).isFilled()) {
            image4.setVisibility(View.VISIBLE);
            if(garage.getArr().get(2).getTypecopy().equals("Motorcycle")) {
                image4.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(3).isFilled()) {
            image5.setVisibility(View.VISIBLE);
            if(garage.getArr().get(3).getTypecopy().equals("Motorcycle")) {
                image5.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(4).isFilled()) {
            image6.setVisibility(View.VISIBLE);
        }
        if(garage.getArr().get(5).isFilled()) {
            image7.setVisibility(View.VISIBLE);
            if(garage.getArr().get(5).getTypecopy().equals("Motorcycle")) {
                image7.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(6).isFilled()) {
            image8.setVisibility(View.VISIBLE);
        }
        if(garage.getArr().get(7).isFilled()) {
            image9.setVisibility(View.VISIBLE);
            if(garage.getArr().get(7).getTypecopy().equals("Motorcycle")) {
                image9.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(8).isFilled()) {
            image10.setVisibility(View.VISIBLE);
            if(garage.getArr().get(8).getTypecopy().equals("Motorcycle")) {
                image10.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(9).isFilled()) {
            image11.setVisibility(View.VISIBLE);
            if(garage.getArr().get(9).getTypecopy().equals("Motorcycle")) {
                image11.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(10).isFilled()) {
            image12.setVisibility(View.VISIBLE);
        }
        if(garage.getArr().get(11).isFilled()) {
            image13.setVisibility(View.VISIBLE);
            if(garage.getArr().get(11).getTypecopy().equals("Motorcycle")) {
                image13.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(12).isFilled()) {
            image14.setVisibility(View.VISIBLE);
        }
        if(garage.getArr().get(13).isFilled()) {
            image15.setVisibility(View.VISIBLE);
            if(garage.getArr().get(13).getTypecopy().equals("Motorcycle")) {
                image15.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(14).isFilled()) {
            image16.setVisibility(View.VISIBLE);
        }
        if(garage.getArr().get(15).isFilled()) {
            image17.setVisibility(View.VISIBLE);
            if(garage.getArr().get(15).getTypecopy().equals("Motorcycle")) {
                image17.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(16).isFilled()) {
            image18.setVisibility(View.VISIBLE);
            if(garage.getArr().get(16).getTypecopy().equals("Motorcycle")) {
                image18.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(17).isFilled()) {
            image19.setVisibility(View.VISIBLE);
            if(garage.getArr().get(17).getTypecopy().equals("Motorcycle")) {
                image19.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(18).isFilled()) {
            image20.setVisibility(View.VISIBLE);
        }
        if(garage.getArr().get(19).isFilled()) {
            image21.setVisibility(View.VISIBLE);
            if(garage.getArr().get(19).getTypecopy().equals("Motorcycle")) {
                image21.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(20).isFilled()) {
            image22.setVisibility(View.VISIBLE);
            if(garage.getArr().get(20).getTypecopy().equals("Motorcycle")) {
                image22.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(21).isFilled()) {
            image23.setVisibility(View.VISIBLE);
            if(garage.getArr().get(21).getTypecopy().equals("Motorcycle")) {
                image23.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(22).isFilled()) {
            image24.setVisibility(View.VISIBLE);
        }
        if(garage.getArr().get(23).isFilled()) {
            image25.setVisibility(View.VISIBLE);
            if(garage.getArr().get(23).getTypecopy().equals("Motorcycle")) {
                image25.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(24).isFilled()) {
            image26.setVisibility(View.VISIBLE);
        }
        if(garage.getArr().get(25).isFilled()) {
            image27.setVisibility(View.VISIBLE);
            if(garage.getArr().get(25).getTypecopy().equals("Motorcycle")) {
                image27.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(26).isFilled()) {
            image28.setVisibility(View.VISIBLE);
            if(garage.getArr().get(26).getTypecopy().equals("Motorcycle")) {
                image28.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(27).isFilled()) {
            image29.setVisibility(View.VISIBLE);
        }
        if(garage.getArr().get(28).isFilled()) {
            image30.setVisibility(View.VISIBLE);
            if(garage.getArr().get(28).getTypecopy().equals("Motorcycle")) {
                image30.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(29).isFilled()) {
            image31.setVisibility(View.VISIBLE);
            if(garage.getArr().get(29).getTypecopy().equals("Motorcycle")) {
                image31.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(30).isFilled()) {
            image32.setVisibility(View.VISIBLE);
        }
        if(garage.getArr().get(31).isFilled()) {
            image33.setVisibility(View.VISIBLE);
            if(garage.getArr().get(31).getTypecopy().equals("Motorcycle")) {
                image33.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(32).isFilled()) {
            image34.setVisibility(View.VISIBLE);
            if(garage.getArr().get(32).getTypecopy().equals("Motorcycle")) {
                image34.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(33).isFilled()) {
            image35.setVisibility(View.VISIBLE);
            if(garage.getArr().get(33).getTypecopy().equals("Motorcycle")) {
                image35.setImageResource(R.drawable.motorcycle);
            }
        }
        if(garage.getArr().get(34).isFilled()) {
            image36.setVisibility(View.VISIBLE);
        }
    }

    public void initializeImages() {
        image2 = (ImageView) findViewById(R.id.imageView2);
        image3 = (ImageView) findViewById(R.id.imageView3);
        image4 = (ImageView) findViewById(R.id.imageView4);
        image5 = (ImageView) findViewById(R.id.imageView5);
        image6 = (ImageView) findViewById(R.id.imageView6);
        image7 = (ImageView) findViewById(R.id.imageView7);
        image8 = (ImageView) findViewById(R.id.imageView8);
        image9 = (ImageView) findViewById(R.id.imageView9);
        image10 = (ImageView) findViewById(R.id.imageView10);
        image11 = (ImageView) findViewById(R.id.imageView11);
        image12 = (ImageView) findViewById(R.id.imageView12);
        image13 = (ImageView) findViewById(R.id.imageView13);
        image14 = (ImageView) findViewById(R.id.imageView14);
        image15 = (ImageView) findViewById(R.id.imageView15);
        image16 = (ImageView) findViewById(R.id.imageView16);
        image17 = (ImageView) findViewById(R.id.imageView17);
        image18 = (ImageView) findViewById(R.id.imageView18);
        image19 = (ImageView) findViewById(R.id.imageView19);
        image20 = (ImageView) findViewById(R.id.imageView20);
        image21 = (ImageView) findViewById(R.id.imageView21);
        image22 = (ImageView) findViewById(R.id.imageView22);
        image23 = (ImageView) findViewById(R.id.imageView23);
        image24 = (ImageView) findViewById(R.id.imageView24);
        image25 = (ImageView) findViewById(R.id.imageView25);
        image26 = (ImageView) findViewById(R.id.imageView26);
        image27 = (ImageView) findViewById(R.id.imageView27);
        image28 = (ImageView) findViewById(R.id.imageView28);
        image29 = (ImageView) findViewById(R.id.imageView29);
        image30 = (ImageView) findViewById(R.id.imageView30);
        image31 = (ImageView) findViewById(R.id.imageView31);
        image32 = (ImageView) findViewById(R.id.imageView32);
        image33 = (ImageView) findViewById(R.id.imageView33);
        image34 = (ImageView) findViewById(R.id.imageView34);
        image35 = (ImageView) findViewById(R.id.imageView35);
        image36 = (ImageView) findViewById(R.id.imageView36);
    }


    public void storeGarage(View view) {
        startActivity(new Intent(Floor1.this, AttendantActivity.class));
    }

    public void retrieveVehicle(View view) {
        startActivity(new Intent(Floor1.this, RetrieveActivity.class));
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
