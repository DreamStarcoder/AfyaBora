package com.acuity.afyabora.ui.fragments;

import android.os.Bundle;
import android.support.design.button.MaterialButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.navigation.Navigation;

import com.acuity.afyabora.R;

public class LoginFragment extends Fragment {
    private MaterialButton btn_newAccount;
    private TextView btnForgot;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        btn_newAccount = view.findViewById(R.id.btn_new_account);
        btnForgot = view.findViewById(R.id.btn_forgot);

        btn_newAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_signUpTypeFragment);
            }
        });
        btnForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_loginFragment_to_forgotFragment);
            }
        });
        return view;
    }
}