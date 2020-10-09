package com.example.corridaapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

import com.example.corridaapp.R;
import com.example.corridaapp.fragment.LoginFragment;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    private LoginFragment loginFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginFragment = new LoginFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frameLogin, loginFragment);
        transaction.commit();

    }
}