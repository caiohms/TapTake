package com.example.taptake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class LoadingScreen extends AppCompatActivity {
    boolean token = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(token){
            openHomeScrenn();
        }
    }

    public void openHomeScrenn(){
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }

}