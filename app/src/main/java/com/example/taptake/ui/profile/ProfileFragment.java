package com.example.taptake.ui.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.taptake.databinding.FragmentProfileBinding;

public class ProfileFragment extends Fragment {

    private FragmentProfileBinding binding;
    int SELECT_PICTURE = 200;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentProfileBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.buttonSaveProfile.setOnClickListener(view -> clearEditText());
        binding.buttonSelectImage.setOnClickListener(view -> imageChooser());

        return root;
    }
    public void clearEditText(){
        binding.profileEditTextName.getText().clear();
        binding.profileEditTextEmail.getText().clear();
        binding.profileEditTextPassword.getText().clear();
        binding.profileEditTextPasswordConfirm.getText().clear();

    }

    public void imageChooser() {
        Intent i = new Intent();
        i.setType("image/*");
        i.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(i, "Select Picture"), SELECT_PICTURE);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}