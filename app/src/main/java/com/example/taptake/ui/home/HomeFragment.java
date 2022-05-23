package com.example.taptake.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.taptake.R;
import com.example.taptake.RestaurantScreen;
import com.example.taptake.adapters.RestaurantAdapter;
import com.example.taptake.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        GridView RestaurantGrid = (GridView) root.findViewById(R.id.restaurantGridView);
        RestaurantGrid.setAdapter(new RestaurantAdapter(inflater, getContext(), yes -> {
            Intent intent = new Intent(getContext(), RestaurantScreen.class);
            startActivity(intent);
        }));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}