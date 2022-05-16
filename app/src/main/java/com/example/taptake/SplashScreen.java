package com.example.taptake;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLoading = findViewById(R.id.buttonLoading);
        buttonLoading.setOnClickListener(view -> openLoginScreen());

        Button singUp = findViewById(R.id.singUp);
        singUp.setOnClickListener(view -> openSingUpScreen());

        getWindow().setDecorFitsSystemWindows(false);
        final WindowInsetsController insetsController = getWindow().getInsetsController();
        if (insetsController != null) {
            insetsController.hide(WindowInsets.Type.statusBars());
            insetsController.setSystemBarsBehavior(insetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);
        }

    }

    public void openLoginScreen(){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    public void openSingUpScreen(){
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }

}