package com.example.taptake.fragments;

import android.annotation.SuppressLint;
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
import com.example.taptake.data.Item;

import java.util.function.Consumer;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ItemFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class ItemFragment extends Fragment {
    public Context ctx;
    public Item item;
    public Consumer<Boolean> GoToViewItem;

    public ItemFragment() {
        // Required empty public constructor
    }

    public static ItemFragment newInstance(Context ctx, Item item, Consumer<Boolean> GoToViewItem) {
        ItemFragment fragment = new ItemFragment();
        fragment.ctx = ctx;
        fragment.item = item;
        fragment.GoToViewItem = GoToViewItem;

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstaceState) {
        View view = inflater.inflate(R.layout.fragment_item_single, container, false);

        ImageView imageItem = view.findViewById(R.id.imageItem);
        imageItem.setImageDrawable(ctx.getResources().getDrawable(ctx.getResources().getIdentifier(item.Image, "drawable", ctx.getPackageName())));

        TextView textNameItem = view.findViewById(R.id.textNameItem);
        textNameItem.setText(item.Name);

        TextView textDescriptionItem = view.findViewById(R.id.textDescriptionItem);
        textDescriptionItem.setText(item.Description);

        TextView priceItem = view.findViewById(R.id.priceItem);
        priceItem.setText(String.valueOf(item.Price));

        CardView cardItem = view.findViewById(R.id.cardViewItem);
        cardItem.setOnClickListener(view1 -> {
            Database.SetCurrentItem(item);
            GoToViewItem.accept(true);
        });

        return view;
    }
}
