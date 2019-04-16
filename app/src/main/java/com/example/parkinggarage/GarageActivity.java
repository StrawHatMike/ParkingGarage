package com.example.parkinggarage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class GarageActivity extends AppCompatActivity {
    private TextView textView;
    private EditText emailTxt, passwordTxt;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garage);
        textView = (TextView) findViewById(R.id.textView);
        if(ManagerData.getManager()) {
            textView.setText("Manager Account");
        }
        emailTxt = (EditText) findViewById(R.id.emailTxt);
        passwordTxt = (EditText) findViewById(R.id.passwordTxt);
        mAuth = FirebaseAuth.getInstance();
    }

    public void createAccount(View view) {
        String email, password;
        email = emailTxt.getText().toString();
        password = passwordTxt.getText().toString();
        if(password.length() < 6) {
            Toast.makeText(GarageActivity.this, "Password must be over 6 characters", Toast.LENGTH_LONG).show();
            return;
        }
        if(email.isEmpty() || password.isEmpty()) {
            return;
        }
        mAuth.getInstance().createUserWithEmailAndPassword(email,password);
        Toast.makeText(GarageActivity.this, "User created successfully", Toast.LENGTH_LONG).show();
    }
}
