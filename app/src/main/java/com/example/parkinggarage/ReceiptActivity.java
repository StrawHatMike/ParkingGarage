package com.example.parkinggarage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class ReceiptActivity extends AppCompatActivity {

    TextView textView3, textView4, textView5, textView6, textView7, textView8;
    static Vehicle v;
    Date newDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciept);
        newDate = new Date();
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView3.setText(textView3.getText().toString() + v.getLicenseplate());
        textView4.setText(textView4.getText().toString() + v.getType());
        textView5.setText(textView5.getText().toString() + v.getAttendant());
        textView6.setText(textView6.getText().toString() + v.getDate());
        textView7.setText(textView7.getText().toString() + newDate);
        textView8.setText(textView8.getText().toString() + calculatePrice());

    }

    public String calculatePrice() {
        if(checkDate(v.getDate())) {
            switch (v.getType()) {
                case "Car" : return "20.00";
                case "Motorcycle" : return "10.00";
                case "Truck" : return "40.00";
                default: return "N/A";
            }
        } else {
            long difference = newDate.getTime() - v.getDate().getTime();
            difference /= 1000 * 3600;
            if(v.getType().equals("Car")) {
                return Double.toString(difference * 2.50);
            } else if(v.getType().equals("Motorcycle")) {
                return Double.toString(difference * 1.00);
            } else if(v.getType().equals("Truck")){
                return Double.toString(difference * 5.00);
            } else {
                return "N/A";
            }
        }
    }

    public boolean checkDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.HOUR) * 60 < 9 * 60;
    }

    public void returnToFloor(View view) {
        startActivity(new Intent(ReceiptActivity.this, Floor1.class));
    }
}
