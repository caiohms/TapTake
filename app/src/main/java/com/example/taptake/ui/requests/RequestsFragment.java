package com.example.taptake.ui.requests;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.taptake.adapters.OrderAdapter;
import com.example.taptake.databinding.FragmentRequestsBinding;

public class RequestsFragment extends Fragment {
    private FragmentRequestsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentRequestsBinding.inflate(inflater, container, false);
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