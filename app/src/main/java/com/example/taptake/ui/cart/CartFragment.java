package com.example.taptake.ui.cart;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

        binding.buttonSheduling.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), SchedulingScreen.class);
            startActivity(intent);
        });

        UpdatePrice();

        return root;
    }

    public void UpdatePrice() {
        double Value = 0;

        if (Database.CurrentOrder != null)
            Value = Database.CurrentOrder.GetPrice();

        binding.valorTotal.setText(String.valueOf(Value));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}