package com.example.taptake.ui.delivery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.taptake.adapters.DeliveryAdapter;
import com.example.taptake.databinding.FragmentDeliveryBinding;

public class DeliveryFragment extends Fragment {
    private FragmentDeliveryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentDeliveryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.listDelivery.setAdapter(new DeliveryAdapter(inflater, getContext()));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}