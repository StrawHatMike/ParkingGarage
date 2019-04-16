package com.example.parkinggarage;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private Firebase mRootRef;
    private FirebaseAuth mAuth;
    private EditText emailText, passwordText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Firebase.setAndroidContext(this);
        mRootRef = new Firebase("https://parkinggarage-d8ff3.firebaseio.com");
        mAuth = FirebaseAuth.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailText = (EditText) findViewById(R.id.emailText);
        passwordText = (EditText) findViewById(R.id.passwordText);
    }

    public void onClick1(View view) {
        //Intent intent = new Intent(this, RegisterActivity.class);
        //startActivity(intent);
        final String email = emailText.getText().toString();
        final String password = passwordText.getText().toString();
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (!task.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "Error Signing In", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Signed in!", Toast.LENGTH_LONG).show();
                    if(((email.equals(ManagerData.getManagerEmail()))) && (password.equals(ManagerData.getManagerPassword()))) {
                        ManagerData.setManager(true);
                        startActivity(new Intent(MainActivity.this, GarageActivity.class));
                    } else {
                        ManagerData.setManager(false);
                        startActivity(new Intent(MainActivity.this, AttendantActivity.class));
                    }

                }
            }
        });
    }

}
