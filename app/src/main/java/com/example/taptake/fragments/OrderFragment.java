package com.example.taptake.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.taptake.R;
import com.example.taptake.data.Order;

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_order, container, false);

        //        ImageView imageItem = view.findViewById(R.id.imageItem);
//        imageItem.setImageDrawable(ctx.getResources().getDrawable(ctx.getResources().getIdentifier(order.Item.Image, "drawable", ctx.getPackageName())));
//
//        TextView textNameItem = view.findViewById(R.id.textNameItem);
//        textNameItem.setText(order.Items.get(0).Name);
//
//        TextView textDescriptionItem = view.findViewById(R.id.textDescriptionItem);
//        textDescriptionItem.setText(order.Items.get(0).Description);
//
//        TextView restaurant_name_order = view.findViewById(R.id.restaurant_name_order);
        //TODO o nome do pedido esta indo para o nome do restaurante!
//        restaurant_name_order.setText(order.Restaurant.Name);
//
//        TextView data = view.findViewById(R.id.data_item);
//        data.setText(String.valueOf(order.Date));

        TextView priceTotal = view.findViewById(R.id.priceTotal);
        priceTotal.setText(String.format("%.2f", order.Items.get(0).GetTotalPrice()));

        TextView quantityItem = view.findViewById(R.id.quantityItem);
        quantityItem.setText(String.valueOf(order.Items.get(0).Quantity));

        return view;
    }
}