package com.example.taptake.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.taptake.R;
import com.example.taptake.data.FormPayment;

import java.util.function.Consumer;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UniversityFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PaymentFragment extends Fragment {

    public FormPayment payment;

    private Context ctx;

    public Consumer<Boolean> GoToHomeScreen;

    public PaymentFragment() {
        // Required empty public constructor.
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment UniversityFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PaymentFragment newInstance(Context ctx, FormPayment payment) {
        PaymentFragment fragment = new PaymentFragment();
        fragment.payment = payment;
        fragment.ctx = ctx;
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_payment_single, container, false);

        ImageView Imagem = view.findViewById(R.id.image_payment);
        Imagem.setImageDrawable(ctx.getResources().getDrawable(ctx.getResources().getIdentifier(payment.Image, "drawable", ctx.getPackageName())));

        TextView Name = view.findViewById(R.id.payment_name);
        Name.setText(payment.Name);

        // Inflate the layout for this fragment
        return view;
    }
}