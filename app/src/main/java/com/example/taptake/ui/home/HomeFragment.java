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


        CardView carView1 = root.findViewById(R.id.carView1);
        carView1.setOnClickListener(view -> openRestaurant(R.id.carView1));

        CardView carView2 = root.findViewById(R.id.carView2);
        carView2.setOnClickListener(view -> openRestaurant(R.id.carView2));

        CardView carView3 = root.findViewById(R.id.carView3);
        carView3.setOnClickListener(view -> openRestaurant(R.id.carView3));

        CardView carView4 = root.findViewById(R.id.carView4);
        carView4.setOnClickListener(view -> openRestaurant(R.id.carView4));

        CardView carView5 = root.findViewById(R.id.carView5);
        carView5.setOnClickListener(view -> openRestaurant(R.id.carView5));

        CardView carView6 = root.findViewById(R.id.carView6);
        carView6.setOnClickListener(view -> openRestaurant(R.id.carView6));

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