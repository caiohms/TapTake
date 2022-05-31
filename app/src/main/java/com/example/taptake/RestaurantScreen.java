package com.example.taptake;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.taptake.adapters.ItemAdapter;
import com.example.taptake.data.Database;
import com.example.taptake.data.Order;
import com.example.taptake.databinding.ActivityRestaurantScreenBinding;

public class RestaurantScreen extends AppCompatActivity {

    ActivityRestaurantScreenBinding binding;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Database.CurrentOrder != null) {
            if (Database.CurrentOrder.Restaurant != Database.CurrentRestaurant) {
                if (Database.CurrentOrder.Items.size() > 0) {
                    Toast.makeText(getApplicationContext(), "Não será possível adicionar itens deste resturante pois já existem itens no carrinho de outro restaurante.", Toast.LENGTH_LONG).show();
                } else {
                    Database.CurrentOrder = new Order(Database.CurrentRestaurant);
                }
            }
        } else {
            Database.CurrentOrder = new Order(Database.CurrentRestaurant);
        }

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