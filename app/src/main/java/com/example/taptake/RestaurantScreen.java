package com.example.taptake;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.taptake.databinding.ActivityRestaurantScreenBinding;

public class RestaurantScreen extends AppCompatActivity {

    ActivityRestaurantScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRestaurantScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle bundle = this.getIntent().getExtras();
        int idCardView = bundle.getInt("restaurant");

        binding.backButton.setOnClickListener(view -> openHomeScreen());

        switch (idCardView){
            case R.id.carView1:{
                binding.nameRestaurant.setText("StarBucks");
                break;
            }
            case R.id.carView2:{
                binding.nameRestaurant.setText("McDonald's");
                break;
            }
            case R.id.carView3:{
                binding.nameRestaurant.setText("SubWay");
                break;
            }
            case R.id.carView4:{
                binding.nameRestaurant.setText("Burguer King");
                break;
            }
            case R.id.carView5:{
                binding.nameRestaurant.setText("Habib's");
                break;
            }
            case R.id.carView6:{
                binding.nameRestaurant.setText("Cacau Show");
                break;
            }

        }

    }

    public void openHomeScreen() {
        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }
}