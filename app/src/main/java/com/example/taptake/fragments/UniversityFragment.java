package com.example.taptake.fragments;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.taptake.R;
import com.example.taptake.data.Database;
import com.example.taptake.data.UserUniversity;

import java.util.function.Consumer;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UniversityFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UniversityFragment extends Fragment {

    public UserUniversity university;

    private Context ctx;

    public Consumer<Boolean> GoToHomeScreen;

    public UniversityFragment() {
        // Required empty public constructor.
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment UniversityFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static UniversityFragment newInstance(Context ctx, UserUniversity university, Consumer<Boolean> GoToHomeScreen) {
        UniversityFragment fragment = new UniversityFragment();
        fragment.university = university;
        fragment.ctx = ctx;
        fragment.GoToHomeScreen = GoToHomeScreen;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_university_single, container, false);

        ImageView Logo = view.findViewById(R.id.university_logo1);
        Logo.setImageDrawable(ctx.getResources().getDrawable(ctx.getResources().getIdentifier(university.University.Image, "drawable", ctx.getPackageName())));

        TextView Name = view.findViewById(R.id.university_name);
        Name.setText(university.University.Name);

        TextView Description = view.findViewById(R.id.university_address);
        Description.setText(university.University.Description);

        ImageButton Favorite = view.findViewById(R.id.buttonStar);
        Favorite.setOnClickListener(view12 -> {
            university.Favorite = !university.Favorite;

            Favorite.setImageResource(university.Favorite ? R.drawable.ic_baseline_star_24 : R.drawable.ic_baseline_star_border_24);
        });

        Favorite.setImageResource(university.Favorite ? R.drawable.ic_baseline_star_24 : R.drawable.ic_baseline_star_border_24);

        CardView Card = view.findViewById(R.id.cardViewUniversity);

        Card.setOnClickListener(view1 -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(ctx);
            builder.setCancelable(true);
            builder.setTitle("Troca de Universidade");
            builder.setMessage("Deseja mesmo trocar de Universidade?");
            builder.setPositiveButton("Confirmar",
                    (dialog, which) -> {
                        Database.CurrentUniversity = university;
                        GoToHomeScreen.accept(true);
                    });
            builder.setNegativeButton(android.R.string.cancel, (dialog, which) -> {
            });

            AlertDialog dialog = builder.create();
            dialog.show();

        });

        // Inflate the layout for this fragment
        return view;
    }
}