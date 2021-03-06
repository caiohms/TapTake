package com.example.taptake.adapters;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.taptake.data.Database;
import com.example.taptake.fragments.UniversityFragment;

import java.util.function.Consumer;

public class UserUniversityAdapter extends BaseAdapter {

    public LayoutInflater inflater;
    public Context ctx;
    public Consumer<Boolean> GoToHomeScreen;

    public UserUniversityAdapter(LayoutInflater inflater, Context ctx, Consumer<Boolean> GoToHomeScreen) {
        this.inflater = inflater;
        this.ctx = ctx;
        this.GoToHomeScreen = GoToHomeScreen;
    }

    @Override
    public int getCount() {
        return Database.Universities.size();
    }

    @Override
    public Object getItem(int i) {
        return Database.Universities.get(i);
    }

    @Override
    public long getItemId(int i) {
        return Database.Universities.get(i).hashCode();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        UniversityFragment Fragment = UniversityFragment.newInstance(ctx, Database.Universities.get(i), GoToHomeScreen);

        return Fragment.onCreateView(inflater, viewGroup, Bundle.EMPTY);
    }
}
