package com.example.corridaapp.fragment;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.example.corridaapp.R;
import com.example.corridaapp.activity.MainActivity;
import com.example.corridaapp.activity.RegistrarActivity;
import com.example.corridaapp.models.Usuario;
import com.example.corridaapp.services.AuthService;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_login, container, false);

        View btnReg = view.findViewById(R.id.btnReg);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

        View btnLoginReal = view.findViewById(R.id.btnLoginReal);
        btnLoginReal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean validator = false;

                TextView etEmail = view.findViewById(R.id.etEmail);
                TextView etSenha = view.findViewById(R.id.etSenha);
                String senha = etSenha.getText().toString();
                if (senha.isEmpty() || senha.length() < 6) {
                    validator = true;
                    etSenha.setError("A senha deve ter 6 digitos ou mais");
                }

                AuthService authService = new AuthService();
                etEmail.findViewById(R.id.etEmail);
                etSenha.findViewById(R.id.etSenha);

                if (validator == false && authService.validarLogin(etEmail.getText().toString(), etSenha.getText().toString())) {
                    Intent intentMain = new Intent(LoginFragment.this.getActivity(), MainActivity.class);
                    startActivity(intentMain);
                }
            }
        });

        return view;
    }

    public void openNewActivity() {
        Intent intent = new Intent(LoginFragment.this.getActivity(), RegistrarActivity.class);
        startActivity(intent);
    }

}