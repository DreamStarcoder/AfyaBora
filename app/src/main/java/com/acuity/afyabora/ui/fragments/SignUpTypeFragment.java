package com.acuity.afyabora.ui.fragments;

import android.os.Bundle;
import android.support.design.button.MaterialButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.Navigation;

import com.acuity.afyabora.R;


public class SignUpTypeFragment extends Fragment implements View.OnClickListener {
    private MaterialButton btnPatient, btnDoctor, btnLabor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_signup_type, container, false);
        btnPatient = view.findViewById(R.id.bt_patient);
        btnDoctor = view.findViewById(R.id.bt_doctor);
        btnLabor = view.findViewById(R.id.bt_labortary);

        btnPatient.setOnClickListener(this);
        btnDoctor.setOnClickListener(this);
        btnLabor.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_patient:
                Navigation.findNavController(v).navigate(R.id.action_signUpTypeFragment_to_patientFragment);
                break;
            case R.id.bt_doctor:
                Navigation.findNavController(v).navigate(R.id.action_signUpTypeFragment_to_doctorFragment);
                break;
            case R.id.bt_labortary:
                Navigation.findNavController(v).navigate(R.id.action_signUpTypeFragment_to_labortaryFragment);
                break;
        }
    }
}