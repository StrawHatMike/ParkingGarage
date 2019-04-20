package com.example.parkinggarage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Floor1 extends Garage {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor1);

    }

    public void moveUp(View view) {
        Intent intent = new Intent(this, Floor2.class);
        startActivity(intent);
    }
}
