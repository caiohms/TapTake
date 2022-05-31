package com.example.taptake.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.taptake.R;
import com.example.taptake.data.Delivery;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DeliveryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DeliveryFragment extends Fragment {
    public Context ctx;
    public Delivery delivery;

    public DeliveryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment DeliveryFragment.
     */
    public static DeliveryFragment newInstance(Context ctx, Delivery delivery) {
        DeliveryFragment fragment = new DeliveryFragment();
        fragment.ctx = ctx;
        fragment.delivery = delivery;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint({"DefaultLocale", "UseCompatLoadingForDrawables", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.card_view_delivery, container, false);


        TextView restaurantName = view.findViewById(R.id.textNameDelivery);
        restaurantName.setText(delivery.Name);

        ImageView restaurantLogo = view.findViewById(R.id.restaurantLogo_Delivery);
        restaurantLogo.setImageDrawable(ctx.getResources().getDrawable(ctx.getResources().getIdentifier(delivery.Logo, "drawable", ctx.getPackageName())));

        TextView timerDelivery = view.findViewById(R.id.timer_Delivery);
        timerDelivery.setText(delivery.Hour + ":" + delivery.Minute + ":" + delivery.Seconds);

        TextView priceDelivery = view.findViewById(R.id.price_Delivery);
        priceDelivery.setText(String.format("%.2f", delivery.Price));


        return view;
    }
}