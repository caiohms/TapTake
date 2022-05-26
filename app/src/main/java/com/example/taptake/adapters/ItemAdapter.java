package com.example.taptake.adapters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.taptake.data.Database;
import com.example.taptake.fragments.ItemFragment;

import java.util.function.Consumer;

public class ItemAdapter extends BaseAdapter {


    public LayoutInflater inflater;
    public Context ctx;
    public Consumer<Boolean> GoToViewItem;

    public ItemAdapter(LayoutInflater inflater, Context ctx, Consumer<Boolean>GoToViewItem) {
        this.inflater = inflater;
        this.ctx = ctx;
        this.GoToViewItem = GoToViewItem;
    }

    @Override
    public int getCount() {
        return Database.CurrentRestaurant.Items.size();
    }

    @Override
    public Object getItem(int i) {
        return Database.CurrentRestaurant.Items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return Database.CurrentRestaurant.Items.get(i).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ItemFragment Fragment = ItemFragment.newInstance(ctx, Database.CurrentRestaurant.Items.get(i), GoToViewItem);
        return Fragment.onCreateView(inflater, viewGroup, Bundle.EMPTY);
    }
}
