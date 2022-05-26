package com.example.taptake;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.taptake.databinding.ActivityViewItemScreenBinding;

public class ViewItemScreen extends AppCompatActivity {
    ActivityViewItemScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_item_screen);

        binding = ActivityViewItemScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backButtonRestaurant.setOnClickListener(view -> returnToRestaurant());

    }

    public void returnToRestaurant() {
        super.onBackPressed();
    }
}