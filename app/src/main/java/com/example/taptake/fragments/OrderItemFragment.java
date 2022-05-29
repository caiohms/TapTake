package com.example.taptake.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.taptake.R;
import com.example.taptake.data.Database;
import com.example.taptake.data.OrderItem;

import java.util.function.Consumer;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OrderItemFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrderItemFragment extends Fragment {

    public Context ctx;
    public OrderItem orderItem;
    public Consumer<Boolean> GoToItem;


    public OrderItemFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment OrderItemFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OrderItemFragment newInstance(Context ctx, OrderItem orderItem, Consumer<Boolean> GoToItem) {
        OrderItemFragment fragment = new OrderItemFragment();
        fragment.ctx = ctx;
        fragment.orderItem = orderItem;
        fragment.GoToItem = GoToItem;
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
        View view = inflater.inflate(R.layout.fragment_order_item, container, false);

        // TODO: Set Data.
        // ON CLICK, Database.SetCurrentItem(orderItem)

        ImageView imageItem = view.findViewById(R.id.imageItem);
        imageItem.setImageDrawable(ctx.getResources().getDrawable(ctx.getResources().getIdentifier(orderItem.Item.Image, "drawable", ctx.getPackageName())));

        TextView textNameItem = view.findViewById(R.id.textNameItem);
        textNameItem.setText(orderItem.Item.Name);

        TextView textDescriptionItem = view.findViewById(R.id.textDescriptionItem);
        textDescriptionItem.setText(orderItem.Item.Description);

        TextView priceItem = view.findViewById(R.id.priceItem);
        priceItem.setText(String.format("%.2f",orderItem.GetTotalPrice()));

        TextView quantityItem = view.findViewById(R.id.quantityItem);
        quantityItem.setText(String.valueOf(orderItem.Quantity));

        CardView cardItem = view.findViewById(R.id.cardViewItem);
        cardItem.setOnClickListener(view1 -> {
            Database.SetCurrentItem(orderItem);
            GoToItem.accept(true);
        });


        return view;
    }
}