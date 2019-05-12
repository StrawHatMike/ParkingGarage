package com.example.parkinggarage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class RetrieveActivity extends AppCompatActivity {

    EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve);
        editText2 = (EditText) findViewById(R.id.editText2);
    }

    public void find(View view) {
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
        Query searchQuery = ref.child("database").child("data").child("arr").orderByChild("licensecopy").equalTo(editText2.getText().toString());
        searchQuery.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot searchSnapshot: dataSnapshot.getChildren()) {
                    System.out.println("Found!'");
                    VehicleSpace newSpace = new VehicleSpace(searchSnapshot.child("type").getValue().toString());
                    newSpace.setDistance(Integer.valueOf(searchSnapshot.child("distance").getValue().toString()));
                    searchSnapshot.getRef().setValue(newSpace);
                    return;
                }
                System.out.println("Not Found");
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                System.out.println("Error!");
            }
        });
        startActivity(new Intent(RetrieveActivity.this, Floor1.class));
    }
}
