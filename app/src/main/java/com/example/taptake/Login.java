package com.example.taptake;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

import androidx.appcompat.app.AppCompatActivity;

import com.example.taptake.databinding.ActivityLoginBinding;

public class Login extends AppCompatActivity {

    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.buttonLogar.setOnClickListener(view -> openHomeScreen());

        binding.signUp.setOnClickListener(view -> openSingUpScreen());

        getWindow().setDecorFitsSystemWindows(false);

        final WindowInsetsController insetsController = getWindow().getInsetsController();

        if (insetsController != null) {
            insetsController.hide(WindowInsets.Type.statusBars());
            insetsController.setSystemBarsBehavior(insetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);
        }
    }

    public void openHomeScreen() {
        boolean error = false;
        binding.textLoginEmail.setVisibility(View.INVISIBLE);

        if (binding.loginEditTextEmailAddress.getText().toString().trim().equals("") || binding.loginEditTextPassword.getText().toString().trim().equals("")) {
            binding.textLoginEmail.setVisibility(View.VISIBLE);
            error = true;
        }
        if (!error) {
            binding.textLoginEmail.setVisibility(View.INVISIBLE);
            Intent intent = new Intent(this, HomeScreen.class);
            startActivity(intent);
        }
    }

    public void openSingUpScreen() {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}