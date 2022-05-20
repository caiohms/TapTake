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

import java.util.LinkedList;

class University {
    private boolean checker = true;
    private final android.widget.ImageButton imageButton;

    public University(android.widget.ImageButton iB) {
        imageButton = iB;
        imageButton.setOnClickListener(view -> this.toggle());
    }

    private void toggle() {
        if (checker) {
            imageButton.setImageResource(R.drawable.ic_baseline_star_24);
            checker = false;
        } else {
            imageButton.setImageResource(R.drawable.ic_baseline_star_border_24);
            checker = true;
        }
    }

}

public class UniversityFragment extends Fragment {

    private FragmentUniversityBinding binding;
    private LinkedList<University> universities = new LinkedList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        UniversityViewModel universityViewModel =
                new ViewModelProvider(this).get(UniversityViewModel.class);

        binding = FragmentUniversityBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        universities.add(new University(binding.buttonStar));
        universities.add(new University(binding.buttonStar2));
        universities.add(new University(binding.buttonStar3));
        universities.add(new University(binding.buttonStar4));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}