package com.example.taptake.ui.university;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.taptake.R;
import com.example.taptake.databinding.FragmentUniversityBinding;

public class UniversityFragment extends Fragment {

    private FragmentUniversityBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        UniversityViewModel universityViewModel =
                new ViewModelProvider(this).get(UniversityViewModel.class);

        binding = FragmentUniversityBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.buttonStar.setOnClickListener(view -> favorite(R.id.buttonStar));
        binding.buttonStar2.setOnClickListener(view -> favorite(R.id.buttonStar2));
        binding.buttonStar3.setOnClickListener(view -> favorite(R.id.buttonStar3));
        binding.buttonStar4.setOnClickListener(view -> favorite(R.id.buttonStar4));

        return root;
    }

    public void favorite(int id) {
        switch (id) {
            case R.id.buttonStar: {
                binding.buttonStar.setImageResource(R.drawable.ic_baseline_star_24);
                break;
            }
            case R.id.buttonStar2: {
                binding.buttonStar2.setImageResource(R.drawable.ic_baseline_star_24);
                break;
            }
            case R.id.buttonStar3: {
                binding.buttonStar3.setImageResource(R.drawable.ic_baseline_star_24);
                break;
            }
            case R.id.buttonStar4: {
                binding.buttonStar4.setImageResource(R.drawable.ic_baseline_star_24);
                break;
            }
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}