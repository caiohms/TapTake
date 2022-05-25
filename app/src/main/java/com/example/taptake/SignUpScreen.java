package com.example.taptake;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.taptake.databinding.ActivitySignUpBinding;

public class SignUpScreen extends AppCompatActivity {

    ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonCadastrar.setOnClickListener(view -> openHomeScreen());

        /*getWindow().setDecorFitsSystemWindows(true);

        final WindowInsetsController insetsController = getWindow().getInsetsController();
        if (insetsController != null) {
            insetsController.hide(WindowInsets.Type.statusBars());
            insetsController.setSystemBarsBehavior(insetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);
        }*/
    }

    public void openHomeScreen() {
        boolean error = false;
        binding.textErrorName.setVisibility(View.INVISIBLE);
        binding.textErrorEmail.setVisibility(View.INVISIBLE);
        binding.textErrorPassword.setVisibility(View.INVISIBLE);
        binding.textErrorPasswordConfirm.setVisibility(View.INVISIBLE);


        if (binding.editTextName.getText().toString().trim().equals("")) {
            binding.textErrorName.setVisibility(View.VISIBLE);
            error = true;
        }
        if (binding.editTextEmailAddress.getText().toString().trim().equals("")) {
            binding.textErrorEmail.setVisibility(View.VISIBLE);
            error = true;
        }
        if (binding.editTextPassword.getText().toString().trim().equals("")) {
            binding.textErrorPassword.setVisibility(View.VISIBLE);
            error = true;
        }
        if (binding.editTextPasswordConfirm.getText().toString().trim().equals("")) {
            binding.textErrorPasswordConfirm.setVisibility(View.VISIBLE);
            error = true;
        }

        if (!error) {
            binding.textErrorName.setVisibility(View.INVISIBLE);
            binding.textErrorEmail.setVisibility(View.INVISIBLE);
            binding.textErrorPassword.setVisibility(View.INVISIBLE);
            binding.textErrorPasswordConfirm.setVisibility(View.INVISIBLE);
            Intent intent = new Intent(this, HomeScreen.class);
            startActivity(intent);
        }
    }
}