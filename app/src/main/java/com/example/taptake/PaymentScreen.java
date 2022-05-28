package com.example.taptake;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.taptake.adapters.OrderItemAdapter;
import com.example.taptake.adapters.PaymentAdapter;
import com.example.taptake.data.Database;
import com.example.taptake.databinding.ActivityPaymentScreenBinding;
import com.example.taptake.ui.cart.CartFragment;

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

        binding.buttonGoToScheduling.setOnClickListener(view -> {
            Database.CurrentOrder.Completed = true;
            Database.OrderHistory.add(0, Database.CurrentOrder);
            Database.CurrentOrder = null;

            OrderItemAdapter.Instance.notifyDataSetChanged();
            CartFragment.Instance.UpdatePrice();

            Toast.makeText(getApplicationContext(), "Pedido realizado com sucesso!", Toast.LENGTH_LONG).show();

            startActivity(new Intent(this, HomeScreen.class));
        });
    }

    public void returnToPreviousSchedulingScreen() {
        super.onBackPressed();
    }
}