package com.example.taptake;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.taptake.adapters.PaymentAdapter;
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
        ListView PaymentList = findViewById(R.id.listPayment);
        PaymentList.setAdapter(new PaymentAdapter(getLayoutInflater(), getApplicationContext()));
    }

    public void returnToPreviousSchedulingScreen() {
        super.onBackPressed();
    }
}