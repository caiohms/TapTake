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

        Button singUp = findViewById(R.id.singUp);
        singUp.setOnClickListener(view -> openSingUpScreen());

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
        TextView textErrorEmail = findViewById(R.id.textErrorEmail);
        TextView textErrorPassowrd = findViewById(R.id.textErrorPassowrd);
        textErrorEmail.setVisibility(View.INVISIBLE);
        textErrorPassowrd.setVisibility(View.INVISIBLE);

        if (editTextEmail.getText().toString().trim().equals("")) {
            textErrorEmail.setVisibility(View.VISIBLE);
            error = true;
        }
        if (editTextPassword.getText().toString().trim().equals("")){
            textErrorPassowrd.setVisibility(View.VISIBLE);
            error = true;
        }

        if(!error) {
            textErrorEmail.setVisibility(View.INVISIBLE);
            textErrorPassowrd.setVisibility(View.INVISIBLE);
            Intent intent = new Intent(this, HomeScreen.class);
            startActivity(intent);
        }
    }

    public void openSingUpScreen() {
        Intent intent = new Intent(this, SingUp.class);
        startActivity(intent);
    }


}