package com.acuity.afyabora.ui.fragments.authen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.acuity.afyabora.R;
import com.google.android.material.button.MaterialButton;

public class ForgotFragment extends Fragment {
    private MaterialButton btnNewAccount;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_forgot, container, false);
        btnNewAccount = view.findViewById(R.id.btn_new_account);
        btnNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_forgotFragment_to_signUpTypeFragment);
            }
        });
        return view;
    }
}