package com.acuity.afyabora.ui.fragments.authen;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.acuity.afyabora.R;
import com.acuity.afyabora.utils.Validation;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginFragment extends Fragment {
    @BindView(R.id.et_mail)
    TextInputEditText etMail;
    @BindView(R.id.etL_mail)
    TextInputLayout etlMail;
    @BindView(R.id.et_password)
    TextInputEditText etPassword;
    @BindView(R.id.etl_password)
    TextInputLayout etlPassword;
    private MaterialButton btn_newAccount;
    private TextView btnForgot;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        btn_newAccount = view.findViewById(R.id.btn_new_account);
        btnForgot = view.findViewById(R.id.btn_forgot);
        ButterKnife.bind(this, view);
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

    @OnClick(R.id.btn_login)
    void checkLogin() {
        if (TextUtils.isEmpty(etMail.getText().toString())) {
            etlMail.setError("fill this field");
            etlMail.setFocusable(true);
        } else if (!Validation.checkMail(etMail.getText().toString())) {
            etlMail.setError("check email pattern");
            etlMail.setFocusable(true);
        } else if (TextUtils.isEmpty(etPassword.getText().toString())) {
            etlMail.setError(null);
            etlMail.setFocusable(false);
            etlPassword.setError("fill this field");
            etlPassword.setFocusable(true);
        } else if (!Validation.checkPassword(etPassword.getText().toString())) {
            etlMail.setError(null);
            etlMail.setFocusable(false);
            etlPassword.setError("password must be 6 or greater and (one upper case,special and numeric)");
            etlPassword.setFocusable(true);
        } else {
            etlPassword.setError(null);
            etlMail.setError(null);
            etlPassword.setFocusable(false);
            etlMail.setFocusable(false);

        }
    }
}