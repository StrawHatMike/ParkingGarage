package com.example.parkinggarage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Floor3 extends Garage {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor3);
    }

    public void moveDown(View view) {
        Intent intent = new Intent(this, Floor2.class);
        startActivity(intent);
    }
}
