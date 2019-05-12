package com.example.parkinggarage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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

    }

    public void returnToGarage(View view) {
        startActivity(new Intent(TicketActivity.this, Floor1.class));
    }

}
