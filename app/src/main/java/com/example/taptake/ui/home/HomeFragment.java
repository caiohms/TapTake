package com.example.taptake.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.taptake.R;
import com.example.taptake.RestaurantScreen;
import com.example.taptake.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    View root;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel HomeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.carView1.setOnClickListener(view -> openRestaurant(R.id.carView1));
        binding.carView2.setOnClickListener(view -> openRestaurant(R.id.carView2));
        binding.carView3.setOnClickListener(view -> openRestaurant(R.id.carView3));
        binding.carView4.setOnClickListener(view -> openRestaurant(R.id.carView4));
        binding.carView5.setOnClickListener(view -> openRestaurant(R.id.carView5));
        binding.carView6.setOnClickListener(view -> openRestaurant(R.id.carView6));

        return root;
    }

    public void openRestaurant(int id) {
        Intent intent = new Intent(HomeFragment.this.getActivity(), RestaurantScreen.class);
        Bundle bundle = new Bundle();
        bundle.putInt("restaurant", id);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}