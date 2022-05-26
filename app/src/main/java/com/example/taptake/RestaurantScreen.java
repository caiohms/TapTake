package com.example.taptake;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.taptake.adapters.ItemAdapter;
import com.example.taptake.data.Database;
import com.example.taptake.data.Order;
import com.example.taptake.databinding.ActivityRestaurantScreenBinding;

public class RestaurantScreen extends AppCompatActivity {

    ActivityRestaurantScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Database.CurrentOrder = new Order();

        binding = ActivityRestaurantScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backButton.setOnClickListener(view -> returnToPreviousHomeScreen());
        binding.nameRestaurant.setText(Database.CurrentRestaurant.Name);
        binding.imageRestaurantBanner.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(Database.CurrentRestaurant.Banner, "drawable", getPackageName())));
        binding.itemList.setAdapter(new ItemAdapter(getLayoutInflater(), getApplicationContext(), yes -> {
            Intent intent = new Intent(this, ViewItemScreen.class);
            startActivity(intent);
        }));
    }

    public void returnToPreviousHomeScreen() {
        super.onBackPressed();
    }
}