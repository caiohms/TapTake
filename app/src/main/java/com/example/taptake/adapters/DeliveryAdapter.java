package com.example.taptake.adapters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.taptake.data.Database;
import com.example.taptake.fragments.DeliveryFragment;

public class DeliveryAdapter extends BaseAdapter {

    public LayoutInflater inflater;
    public Context ctx;

    public DeliveryAdapter(LayoutInflater inflater, Context ctx) {
        this.inflater = inflater;
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return Database.Delivery.size();
    }

    @Override
    public Object getItem(int i) {
        return Database.Delivery.get(i);
    }

    @Override
    public long getItemId(int i) {
        return Database.Delivery.get(i).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        DeliveryFragment Fragment = DeliveryFragment.newInstance(ctx, Database.Delivery.get(i));
        return Fragment.onCreateView(inflater, viewGroup, Bundle.EMPTY);
    }
}

