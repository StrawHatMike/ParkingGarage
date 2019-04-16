package com.example.parkinggarage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GarageActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);
        textView = (TextView) findViewById(R.id.textView);

        if(ManagerData.getManager()) {
            textView.setText("Manager Account");
        }
    }
}
