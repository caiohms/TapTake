package com.example.taptake.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import com.example.taptake.R;
import com.example.taptake.data.Delivery;

import java.util.Calendar;
import java.util.Date;

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

    private Handler timerHandler;
    private Runnable updater;

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    public void onDestroy() {
        if (timerHandler.hasCallbacks(updater)) {
            timerHandler.removeCallbacks(updater);
        }

        super.onDestroy();
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

        TextView priceDelivery = view.findViewById(R.id.price_Delivery);
        priceDelivery.setText(String.format("%.2f", delivery.Price));

        Button acceptBtn = view.findViewById(R.id.button_Accept_delivery);

        if (delivery.Taken) {
            acceptBtn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
            acceptBtn.setEnabled(false);
        }

        acceptBtn.setOnClickListener(view1 -> {
            delivery.Taken = true;

            acceptBtn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
            acceptBtn.setEnabled(false);
        });

        timerHandler = new Handler();

        updater = () -> {
            delivery.Tick();

            long DiffMilis = delivery.Time - Calendar.getInstance().getTimeInMillis();

            if (DiffMilis > 0) {

                Date Diff = new Date(DiffMilis);

                timerDelivery.setText(Diff.getHours() + ":" + Diff.getMinutes() + ":" + Diff.getSeconds());

                timerHandler.postDelayed(updater, 1000);
            } else {
                timerDelivery.setText("00:00:00");

                timerHandler.removeCallbacks(updater);

                acceptBtn.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
                acceptBtn.setEnabled(false);
            }
        };

        timerHandler.post(updater);

        return view;
    }
}