package com.example.taptake.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.taptake.R;
import com.example.taptake.databinding.FragmentHomeBinding;
import com.example.taptake.ui.restaurant.RestaurantFragment;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    View newView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel HomeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);

        newView = inflater.inflate(R.layout.fragment_home, container, false);

        CardView carView1 = newView.findViewById(R.id.carView1);
        carView1.setOnClickListener(view -> openRestaurant());

        CardView carView2 = newView.findViewById(R.id.carView2);
        carView2.setOnClickListener(view -> openRestaurant());

        CardView carView3 = newView.findViewById(R.id.carView3);
        carView3.setOnClickListener(view -> openRestaurant());

        CardView carView4 = newView.findViewById(R.id.carView4);
        carView4.setOnClickListener(view -> openRestaurant());

        CardView carView5 = newView.findViewById(R.id.carView5);
        carView5.setOnClickListener(view -> openRestaurant());

        CardView carView6 = newView.findViewById(R.id.carView6);
        carView6.setOnClickListener(view -> openRestaurant());

        return newView;
    }

    public void openRestaurant() {
        Intent intent = new Intent(HomeFragment.this.getActivity(), RestaurantFragment.class);
        startActivity(intent);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}