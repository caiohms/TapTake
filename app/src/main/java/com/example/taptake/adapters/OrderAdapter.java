package com.example.taptake.adapters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.taptake.data.Database;
import com.example.taptake.fragments.OrderFragment;

public class OrderAdapter extends BaseAdapter {

    public LayoutInflater inflater;
    public Context ctx;

    public OrderAdapter(LayoutInflater inflater, Context ctx) {
        this.inflater = inflater;
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return Database.OrderHistory.size();
    }

    @Override
    public Object getItem(int i) {
        return Database.OrderHistory.get(i);
    }

    @Override
    public long getItemId(int i) {
        return Database.OrderHistory.get(i).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        OrderFragment Fragment = OrderFragment.newInstance(Database.OrderHistory.get(i));
        return Fragment.onCreateView(inflater, viewGroup, Bundle.EMPTY);
    }
}
