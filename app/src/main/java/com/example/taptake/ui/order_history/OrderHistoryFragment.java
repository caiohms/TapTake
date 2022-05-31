package com.example.taptake.ui.order_history;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.taptake.adapters.OrderAdapter;
import com.example.taptake.databinding.FragmentOrderHistoryBinding;

public class OrderHistoryFragment extends Fragment {
    private FragmentOrderHistoryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentOrderHistoryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.orderList.setAdapter(new OrderAdapter(inflater, getContext()));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}