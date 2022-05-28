package com.example.taptake;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.taptake.adapters.OrderItemAdapter;
import com.example.taptake.data.Database;
import com.example.taptake.data.Item;
import com.example.taptake.data.OrderItem;
import com.example.taptake.databinding.ActivityViewItemScreenBinding;
import com.example.taptake.ui.cart.CartFragment;

public class ViewItemScreen extends AppCompatActivity {
    ActivityViewItemScreenBinding binding;
    int numberOrder = 1;

    Item CurrentItemData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewItemScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        CurrentItemData = Database.CurrentOrderItem != null ? Database.CurrentOrderItem.Item : Database.CurrentItem;

        binding.backButtonRestaurant.setOnClickListener(view -> onBackPressed());
        binding.imageItem.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(CurrentItemData.Image, "drawable", getPackageName())));
        binding.textNameItem.setText(CurrentItemData.Name);
        binding.textDescriptionItem.setText(CurrentItemData.Description);

        if (Database.CurrentOrderItem != null) {
            binding.buttonAddItem.setText(R.string.text_alterar);
            numberOrder = Database.CurrentOrderItem.Quantity;
        }
        binding.quantityValue.setText(String.valueOf(numberOrder));

        binding.buttonAddItem.setOnClickListener(view -> {
            if (Database.CurrentOrderItem != null) {
                Database.CurrentOrderItem.Quantity = numberOrder;

                OrderItemAdapter.Instance.notifyDataSetChanged();
                CartFragment.Instance.UpdatePrice();

            } else {
                OrderItem NewOrderItem = new OrderItem(CurrentItemData, numberOrder);

                Database.CurrentOrder.Items.add(NewOrderItem);
            }

            onBackPressed();
        });

        if (Database.CurrentItem != null && Database.CurrentOrder.Restaurant != Database.CurrentRestaurant) {
            binding.buttonAddItem.setEnabled(false);
            binding.buttonAddItem.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
        }

        if (Database.CurrentOrderItem != null)
            binding.buttonCarrinho.setText(R.string.button_remove);

        binding.buttonCarrinho.setOnClickListener(view -> {

            if (Database.CurrentOrderItem != null) {

                Database.CurrentOrder.Items.remove(Database.CurrentOrderItem);

                if (Database.CurrentOrder.Items.size() <= 0)
                    Database.CurrentOrder = null;

                OrderItemAdapter.Instance.notifyDataSetChanged();
                CartFragment.Instance.UpdatePrice();

                onBackPressed();

            } else {
                // TODO: Go To Carrinho.
                HomeScreen.GoToCarrinho = true;
                startActivity(new Intent(this, HomeScreen.class));
            }

        });

        updateItemPrice();

        binding.buttonAdd.setOnClickListener(view -> {
            if (numberOrder <= 100) {
                numberOrder += 1;
                binding.quantityValue.setText(String.valueOf(numberOrder));

                updateItemPrice();
            }
        });
        binding.buttonRemove.setOnClickListener(view -> {
            if (numberOrder > 1) {
                numberOrder -= 1;
//                binding.quantityValue.setText((CharSequence) Database.CurrentOrder);
                binding.quantityValue.setText(String.valueOf(numberOrder));

                updateItemPrice();
            }
        });
    }

    private void updateItemPrice() {
        double totalPrice = CurrentItemData.Price * numberOrder;

        binding.textValuePayable.setText(String.valueOf(totalPrice));
    }
}