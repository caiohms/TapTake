package com.example.taptake;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.taptake.databinding.ActivitySchedulingBinding;

public class Scheduling extends AppCompatActivity {
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
    }

    public void returnToPreviousRestaurantScreen() {
        Intent intent = new Intent(this, RestaurantScreen.class);
        startActivity(intent);
    }
}