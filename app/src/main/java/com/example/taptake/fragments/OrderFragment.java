package com.example.taptake.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.taptake.R;
import com.example.taptake.data.Order;

import java.util.Date;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OrderFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrderFragment extends Fragment {
    public Context ctx;
    public Order order;

    public OrderFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment OrderFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OrderFragment newInstance(Context ctx, Order order) {
        OrderFragment fragment = new OrderFragment();
        fragment.ctx = ctx;
        fragment.order = order;
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
        View view = inflater.inflate(R.layout.fragment_order, container, false);

        ImageView imageItem = view.findViewById(R.id.imageItem);
        imageItem.setImageDrawable(ctx.getResources().getDrawable(ctx.getResources().getIdentifier(order.Restaurant.Logo, "drawable", ctx.getPackageName())));

        TextView textNameRestaurant = view.findViewById(R.id.textNameRestaurant);
        textNameRestaurant.setText(order.Restaurant.Name);

        TextView data_item = view.findViewById(R.id.data_item);
        data_item.setText(DateFormat.format("dd/MM/yyyy", new Date(order.Date)).toString() + "  " + order.Hour + ":" + order.Minute);

        TextView priceTotal = view.findViewById(R.id.priceTotal);
        priceTotal.setText(String.format("%.2f", order.GetPrice()));

        TextView quantityItem = view.findViewById(R.id.quantityItem);
        quantityItem.setText(String.valueOf(order.GetQuantity()));

        ImageView paymentImage = view.findViewById(R.id.image_payment_order);
        paymentImage.setImageDrawable(ctx.getResources().getDrawable(ctx.getResources().getIdentifier(order.Payment.Image, "drawable", ctx.getPackageName())));

        return view;
    }
}

