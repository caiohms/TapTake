package com.example.taptake.adapters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.taptake.data.Database;
import com.example.taptake.fragments.OrderItemFragment;

import java.util.function.Consumer;

public class OrderItemAdapter extends BaseAdapter {

    public LayoutInflater inflater;
    public Context ctx;
    public Consumer<Boolean> GoToItem;

    public static OrderItemAdapter Instance;

    public OrderItemAdapter(LayoutInflater inflater, Context ctx, Consumer<Boolean> GoToItem) {
        this.inflater = inflater;
        this.ctx = ctx;
        this.GoToItem = GoToItem;

        Instance = this;
    }

    @Override
    public int getCount() {
        if (Database.CurrentOrder == null)
            return 0;
        return Database.CurrentOrder.Items.size();
    }

    @Override
    public Object getItem(int i) {
        return Database.CurrentOrder.Items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return Database.CurrentOrder.Items.get(i).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        OrderItemFragment Fragment = OrderItemFragment.newInstance(ctx, Database.CurrentOrder.Items.get(i), GoToItem);
        return Fragment.onCreateView(inflater, viewGroup, Bundle.EMPTY);
    }
}
