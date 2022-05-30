package com.example.taptake;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.taptake.data.Database;
import com.example.taptake.databinding.ActivitySplashScreenBinding;

public class SplashScreen extends AppCompatActivity {

    ActivitySplashScreenBinding binding;

    @RequiresApi(api = Build.VERSION_CODES.R)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load Database.
        Database.LoadDatabase();

        binding = ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonLoading.setOnClickListener(view -> openLoginScreen());
        binding.signUp.setOnClickListener(view -> openSignUpScreen());


        getWindow().setDecorFitsSystemWindows(false);

        final WindowInsetsController insetsController = getWindow().getInsetsController();

        if (insetsController != null) {
            insetsController.hide(WindowInsets.Type.statusBars());
            insetsController.setSystemBarsBehavior(insetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);
        }

    }

    public void openLoginScreen() {
//      Login
        Intent intent = new Intent(this, HomeScreen.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    public void openSignUpScreen() {
        Intent intent = new Intent(this, SignUpScreen.class);
        startActivity(intent);
    }

}