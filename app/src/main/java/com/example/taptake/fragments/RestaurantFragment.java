package com.example.taptake.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.taptake.R;
import com.example.taptake.data.Database;
import com.example.taptake.data.Restaurant;

import java.util.function.Consumer;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RestaurantFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RestaurantFragment extends Fragment {

    public Context ctx;
    public Restaurant restaurant;
    public Consumer<Boolean> GoToRestaurantScreen;

    public RestaurantFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment RestaurantFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RestaurantFragment newInstance(Context ctx, Restaurant restaurant, Consumer<Boolean> GoToRestaurantScreen) {
        RestaurantFragment fragment = new RestaurantFragment();
        fragment.ctx = ctx;
        fragment.restaurant = restaurant;
        fragment.GoToRestaurantScreen = GoToRestaurantScreen;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurant_single, container, false);

        ImageView Image = view.findViewById(R.id.imageRestaurant);
        Image.setImageDrawable(ctx.getResources().getDrawable(ctx.getResources().getIdentifier(restaurant.Logo, "drawable", ctx.getPackageName())));

        CardView Card = view.findViewById(R.id.cardViewRestaurant);
        Card.setOnClickListener(view1 -> {
            Database.CurrentRestaurant = restaurant;
            GoToRestaurantScreen.accept(true);
        });

        // Inflate the layout for this fragment
        return view;
    }
}