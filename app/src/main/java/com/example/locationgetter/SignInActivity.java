package com.example.locationgetter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);



    findViewById(R.id.mainActivity).setOnClickListener(e->{
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    });
}
}
