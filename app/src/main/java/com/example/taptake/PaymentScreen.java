package com.example.taptake;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
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

    public static PaymentScreen Instance;

    ActivityPaymentScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_screen);

        Instance = this;

        binding = ActivityPaymentScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.backButtonPayment.setOnClickListener(view -> returnToPreviousSchedulingScreen());
        ListView PaymentList = findViewById(R.id.listPayment);
        PaymentList.setAdapter(new PaymentAdapter(getLayoutInflater(), getApplicationContext()));

        binding.buttonFinishPedido.setOnClickListener(view -> {
            Database.CurrentOrder.Completed = true;
            Database.OrderHistory.add(0, Database.CurrentOrder);
            Database.CurrentOrder = null;

            OrderItemAdapter.Instance.notifyDataSetChanged();
            CartFragment.Instance.UpdateCart();

            Toast.makeText(getApplicationContext(), "Pedido realizado com sucesso!", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(this, HomeScreen.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);

        });

        UpdatePayment();
    }

    public void UpdatePayment() {
        binding.buttonFinishPedido.setEnabled(Database.CurrentOrder.Payment != null);
        binding.buttonFinishPedido.setBackgroundTintList(ColorStateList.valueOf(binding.buttonFinishPedido.isEnabled() ? Color.parseColor("#ffb500") : Color.GRAY));
        binding.formaPagamento.setText(Database.CurrentOrder.Payment != null ? Database.CurrentOrder.Payment.Name : "nenhum");
    }

    public void returnToPreviousSchedulingScreen() {
        Database.CurrentPaymentMethodFragment = null;
        Database.CurrentOrder.Payment = null;

        super.onBackPressed();
    }
}