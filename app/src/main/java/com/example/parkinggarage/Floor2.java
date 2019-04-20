package com.example.parkinggarage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Floor2 extends Garage {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor2);
    }

    public void moveUp(View view) {
        Intent intent = new Intent(this, Floor3.class);
        startActivity(intent);
    }

    public void moveDown(View view) {
        Intent intent = new Intent(this, Floor1.class);
        startActivity(intent);
    }
}
