package com.example.taptake;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.taptake.databinding.ActivityPaymentScreenBinding;

public class PaymentScreen extends AppCompatActivity {

    ActivityPaymentScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_screen);

        binding = ActivityPaymentScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backButtonPayment.setOnClickListener(view -> returnToPreviousSchedulingScreen());
    }

    public void returnToPreviousSchedulingScreen() {
        super.onBackPressed();
    }
}