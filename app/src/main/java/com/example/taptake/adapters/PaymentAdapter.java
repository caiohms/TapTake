package com.example.taptake.adapters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.taptake.data.Database;
import com.example.taptake.fragments.PaymentFragment;

public class PaymentAdapter extends BaseAdapter {

    public LayoutInflater inflater;
    public Context ctx;

    public PaymentAdapter(LayoutInflater inflater, Context ctx) {
        this.inflater = inflater;
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return Database.Payments.size();
    }

    @Override
    public Object getItem(int i) {
        return Database.Payments.get(i);
    }

    @Override
    public long getItemId(int i) {
        return Database.Payments.get(i).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        PaymentFragment Fragment = PaymentFragment.newInstance(ctx, Database.Payments.get(i));

        return Fragment.onCreateView(inflater, viewGroup, Bundle.EMPTY);
    }
}
