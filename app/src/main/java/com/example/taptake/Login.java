package com.example.taptake;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button buttonLogar = findViewById(R.id.buttonLogar);
        buttonLogar.setOnClickListener(view -> openHomeScreen());

        Button signUp = findViewById(R.id.singUp);
        signUp.setOnClickListener(view -> openSingUpScreen());

        getWindow().setDecorFitsSystemWindows(false);
        final WindowInsetsController insetsController = getWindow().getInsetsController();
        if (insetsController != null) {
            insetsController.hide(WindowInsets.Type.statusBars());
            insetsController.setSystemBarsBehavior(insetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);
        }
    }
    public void openHomeScreen() {
        boolean error = false;
        EditText editTextEmail = findViewById(R.id.editTextTextEmailAddress);
        EditText editTextPassword = findViewById(R.id.editTextTextPassword);
        TextView textLoginEmail = findViewById(R.id.textLoginEmail);
        textLoginEmail.setVisibility(View.INVISIBLE);

        if (editTextEmail.getText().toString().trim().equals("") || editTextPassword.getText().toString().trim().equals("")) {
            textLoginEmail.setVisibility(View.VISIBLE);
            error = true;
        }
        if(!error){
            textLoginEmail.setVisibility(View.INVISIBLE);
            Intent intent = new Intent(this, HomeScreen.class);
            startActivity(intent);
        }
    }
    public void openSingUpScreen() {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}