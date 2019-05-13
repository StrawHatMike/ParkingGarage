package com.example.parkinggarage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Date;

import static com.example.parkinggarage.Floor1.garage;

public class AttendantActivity extends AppCompatActivity {

    RadioButton radioButton, radioButton2, radioButton3;
    EditText editText, editText3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendant);
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        editText = (EditText) findViewById(R.id.editText);
        editText3 = (EditText) findViewById(R.id.editText3);
    }

    public void addVehicle(View view) {
        String lp = editText.getText().toString();
        Vehicle v = new Vehicle();
        if(radioButton.isChecked()) {
            v.setType("Car");
        } else if(radioButton2.isChecked()) {
            v.setType("Truck");
        } else if(radioButton3.isChecked()) {
            v.setType("Motorcycle");
        } else {
            v.setType("Car");
        }
        v.setLicenseplate(lp);
        v.setDate(new Date());
        v.setAttendant(editText3.getText().toString());
        if(garage.insertCar(v)) {
            garage.display();
            final FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference ref = database.getReference("database");
            DatabaseReference child = ref.child("data");
            child.setValue(garage);
            TicketActivity.v = v;
            startActivity(new Intent(AttendantActivity.this, TicketActivity.class));
        }
    }
}
