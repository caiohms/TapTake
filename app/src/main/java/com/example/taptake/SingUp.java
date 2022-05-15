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

public class SingUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        Button buttonCadastrar = findViewById(R.id.buttonCadastrar);
        buttonCadastrar.setOnClickListener(view -> openHomeScreen());


        getWindow().setDecorFitsSystemWindows(false);
        final WindowInsetsController insetsController = getWindow().getInsetsController();
        if (insetsController != null) {
            insetsController.hide(WindowInsets.Type.statusBars());
            insetsController.setSystemBarsBehavior(insetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);
        }
    }

    public void openHomeScreen() {
        boolean error = false;
        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextEmail = findViewById(R.id.editTextTextEmailAddress);
        EditText editTextPassword = findViewById(R.id.editTextTextPassword);
        EditText editTextPassword2 = findViewById(R.id.editTextTextPassword2);

        TextView textErrorName = findViewById(R.id.textErrorName);
        TextView textErrorEmail = findViewById(R.id.textErrorEmail);
        TextView textErrorPassowrd = findViewById(R.id.textErrorPassowrd);
        TextView textErrorPassowrd2 = findViewById(R.id.textErrorPassowrd2);

        textErrorEmail.setVisibility(View.INVISIBLE);
        textErrorPassowrd.setVisibility(View.INVISIBLE);
        textErrorName.setVisibility(View.INVISIBLE);
        textErrorPassowrd2.setVisibility(View.INVISIBLE);


        if (editTextName.getText().toString().trim().equals("")) {
            textErrorName.setVisibility(View.VISIBLE);
            error = true;
        }
        if (editTextEmail.getText().toString().trim().equals("")) {
            textErrorEmail.setVisibility(View.VISIBLE);
            error = true;
        }
        if (editTextPassword.getText().toString().trim().equals("")) {
            textErrorPassowrd.setVisibility(View.VISIBLE);
            error = true;
        }
        if (editTextPassword2.getText().toString().trim().equals("")) {
            textErrorPassowrd2.setVisibility(View.VISIBLE);
            error = true;
        }

        if (!error) {
            textErrorName.setVisibility(View.INVISIBLE);
            textErrorEmail.setVisibility(View.INVISIBLE);
            textErrorPassowrd.setVisibility(View.INVISIBLE);
            textErrorPassowrd2.setVisibility(View.INVISIBLE);
            Intent intent = new Intent(this, HomeScreen.class);
            startActivity(intent);
        }
    }
}