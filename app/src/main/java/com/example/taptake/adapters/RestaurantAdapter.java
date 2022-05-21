package com.example.taptake.adapters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.taptake.data.Database;
import com.example.taptake.fragments.RestaurantFragment;

import java.util.function.Consumer;

public class RestaurantAdapter extends BaseAdapter {

    public LayoutInflater inflater;
    public Context ctx;
    public Consumer<Boolean> GoToRestaurantScreen;

    public RestaurantAdapter(LayoutInflater inflater, Context ctx, Consumer<Boolean> GoToRestaurantScreen) {
        this.inflater = inflater;
        this.ctx = ctx;
        this.GoToRestaurantScreen = GoToRestaurantScreen;
    }

    @Override
    public int getCount() {
        return Database.CurrentUniversity.University.Restaurants.size();
    }

    @Override
    public Object getItem(int i) {
        return Database.CurrentUniversity.University.Restaurants.get(i);
    }

    @Override
    public long getItemId(int i) {
        return Database.CurrentUniversity.University.Restaurants.get(i).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        RestaurantFragment Fragment = RestaurantFragment.newInstance(ctx, Database.CurrentUniversity.University.Restaurants.get(i), GoToRestaurantScreen);

        return Fragment.onCreateView(inflater, viewGroup, Bundle.EMPTY);
    }
}
