package com.example.taptake;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.taptake.data.Database;
import com.example.taptake.databinding.ActivitySchedulingBinding;

public class SchedulingScreen extends AppCompatActivity {
    ActivitySchedulingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheduling);

        binding = ActivitySchedulingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.dateHours.findViewById(R.id.dateHours);
        binding.dateHours.setIs24HourView(true);

        binding.backButtonSchedunlig.setOnClickListener(view -> returnToPreviousRestaurantScreen());
        binding.buttonScheduling.setOnClickListener(view -> openPaymentScrenn());
    }

    public void returnToPreviousRestaurantScreen() {
        super.onBackPressed();
    }

    public void openPaymentScrenn() {
        Database.CurrentOrder.Hour = binding.dateHours.getHour();
        Database.CurrentOrder.Minute = binding.dateHours.getMinute();
        Database.CurrentOrder.Date = binding.calendarView.getDate();
        Intent intent = new Intent(this, PaymentScreen.class);
        startActivity(intent);
    }
}