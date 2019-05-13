package com.example.parkinggarage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class TicketActivity extends AppCompatActivity {

    TextView textlicense, texttype, textname, textdate, textpayment;
    static Vehicle v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);
        textlicense = (TextView) findViewById(R.id.textlicense);
        texttype = (TextView) findViewById(R.id.texttype);
        textname = (TextView) findViewById(R.id.textname);
        textdate = (TextView) findViewById(R.id.textdate);
        textpayment = (TextView) findViewById(R.id.textpayment);
        textlicense.setText(textlicense.getText().toString() + v.getLicenseplate());
        texttype.setText(texttype.getText().toString() + v.getType());
        textname.setText(textname.getText().toString() + " " + v.getAttendant());
        System.out.println(v.getAttendant());
        textdate.setText(textdate.getText().toString() + v.getDate());
        boolean earlyBird = checkDate(v.getDate());
        String price;
        if(earlyBird) {
            switch (v.getType()) {
                case "Car" : price = "20.00"; break;
                case "Motorcycle" : price = "10.00"; break;
                case "Truck" : price = "40.00"; break;
                default: price = "N/A"; break;
            }
        } else {
            switch (v.getType()) {
                case "Car" : price = "2.50 per hour"; break;
                case "Motorcycle" : price = "1.00 per hour"; break;
                case "Truck" : price = "5.00 per hour"; break;
                default: price = "N/A"; break;
            }
        }
        textpayment.setText(textpayment.getText().toString() + price);
    }

    public boolean checkDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.HOUR) * 60 < 9 * 60;
    }

    public void returnToGarage(View view) {
        startActivity(new Intent(TicketActivity.this, Floor1.class));
    }

}
