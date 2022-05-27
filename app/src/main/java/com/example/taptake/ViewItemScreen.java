package com.example.taptake;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.taptake.data.Database;
import com.example.taptake.data.Order;
import com.example.taptake.databinding.ActivityViewItemScreenBinding;

public class ViewItemScreen extends AppCompatActivity {
    ActivityViewItemScreenBinding binding;
    int numberOrder = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Database.CurrentOrder = new Order();

        binding = ActivityViewItemScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backButtonRestaurant.setOnClickListener(view -> returnToRestaurant());
        binding.imageItem.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(Database.CurrentItem.Image, "drawable", getPackageName())));
        binding.textNameItem.setText(Database.CurrentItem.Name);
        binding.textDescriptionItem.setText(Database.CurrentItem.Description);
        binding.textValuePayable.setText(String.valueOf(Database.CurrentItem.Price));
        binding.buttonGoToScheduling.setOnClickListener(view -> openScheduling());

        binding.buttonAdd.setOnClickListener(view -> {
            if (numberOrder <= 100) {
                numberOrder += 1;
                binding.quantityValue.setText(String.valueOf(numberOrder));
            }
        });
        binding.buttonRemove.setOnClickListener(view -> {
            if (numberOrder > 1) {
                numberOrder -= 1;
//                binding.quantityValue.setText((CharSequence) Database.CurrentOrder);
                binding.quantityValue.setText(String.valueOf(numberOrder));
            }
        });
    }

    public void returnToRestaurant() {
        super.onBackPressed();
    }

    public void openScheduling() {
        Intent intent = new Intent(this, SchedulingScreen.class);
        startActivity(intent);
    }
}