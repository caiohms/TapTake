package com.example.taptake.ui.university;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.taptake.HomeScreen;
import com.example.taptake.R;
import com.example.taptake.adapters.UserUniversityAdapter;
import com.example.taptake.databinding.FragmentUniversityBinding;

public class UniversityFragment extends Fragment {

    private FragmentUniversityBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentUniversityBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ListView UniList = root.findViewById(R.id.universityList);

        UniList.setAdapter(new UserUniversityAdapter(inflater, getContext(), yes -> {
            HomeScreen backHomeScreen = (HomeScreen) getContext();
            assert backHomeScreen != null;
            backHomeScreen.onBackPressed();
        }));
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}