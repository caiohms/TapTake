package com.example.taptake;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.taptake.databinding.ActivitySchedulingBinding;

public class SchedulingScreen extends AppCompatActivity {
    ActivitySchedulingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheduling);

        binding = ActivitySchedulingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.datePicker1.findViewById(R.id.datePicker1);
        binding.datePicker1.setIs24HourView(true);

        binding.backButtonSchedunlig.setOnClickListener(view -> returnToPreviousRestaurantScreen());
        binding.buttonScheduling.setOnClickListener(view -> openPaymentScrenn());
    }

    public void returnToPreviousRestaurantScreen() {
        Intent intent = new Intent(this, RestaurantScreen.class);
        startActivity(intent);
    }

    public void openPaymentScrenn() {
        Intent intent = new Intent(this, PaymentScreen.class);
        startActivity(intent);
    }
}