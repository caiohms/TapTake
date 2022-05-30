package com.example.taptake.ui.cart;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.taptake.SchedulingScreen;
import com.example.taptake.ViewItemScreen;
import com.example.taptake.adapters.OrderItemAdapter;
import com.example.taptake.data.Database;
import com.example.taptake.databinding.FragmentCartBinding;

public class CartFragment extends Fragment {

    public static CartFragment Instance;

    private FragmentCartBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        Instance = this;

        binding = FragmentCartBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.orderItemList.setAdapter(new OrderItemAdapter(inflater, getContext(), yes -> {
            Intent intent = new Intent(getActivity(), ViewItemScreen.class);
            startActivity(intent);
        }));

        if (Database.CurrentOrder == null || Database.CurrentOrder.Items == null) {
            binding.buttonSheduling.setEnabled(false);
            binding.buttonSheduling.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
            Toast.makeText(getContext(), "Nenhum item no carrinho!", Toast.LENGTH_LONG).show();
        }
        else{
            binding.buttonSheduling.setEnabled(true);
        }

        binding.buttonSheduling.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), SchedulingScreen.class);
            startActivity(intent);
        });

        UpdatePrice();

        return root;
    }

    @SuppressLint("DefaultLocale")
    public void UpdatePrice() {
        double value = 0;

        if (Database.CurrentOrder != null)
            value = Database.CurrentOrder.GetPrice();

        binding.valorTotal.setText(String.format("%.2f", value));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}