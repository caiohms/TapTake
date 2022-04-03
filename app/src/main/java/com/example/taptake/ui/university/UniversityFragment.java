package com.example.taptake.ui.university;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.taptake.databinding.FragmentUniversityBinding;

public class UniversityFragment extends Fragment {

private FragmentUniversityBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        UniversityViewModel universityViewModel =
                new ViewModelProvider(this).get(UniversityViewModel.class);

    binding = FragmentUniversityBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        final TextView textView = binding.textGallery;
        universityViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}