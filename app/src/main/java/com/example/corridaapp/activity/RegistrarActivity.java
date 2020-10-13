package com.example.corridaapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import com.example.corridaapp.R;
import com.example.corridaapp.fragment.LoginFragment;
import com.example.corridaapp.models.Usuario;
import com.example.corridaapp.models.UsuariosLista;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class RegistrarActivity extends AppCompatActivity {

    UsuariosLista usuariosLista = new UsuariosLista();
    private Button btnRegReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        btnRegReg = findViewById(R.id.btnRegReg);
        btnRegReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrarUsuario();
            }
        });
    }

    public void registrarUsuario() {
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);

        boolean validator = false;

        RadioGroup rgFM = findViewById(R.id.rgFM);
        RadioButton idSelecionado = findViewById(rgFM.getCheckedRadioButtonId());
        String sexoSelecionado = "";
        if (rgFM.getCheckedRadioButtonId() == -1){
            validator = true;
            rgFM.setBackgroundColor(Color.parseColor("#db7770"));
            Toast.makeText(getApplicationContext(), "Favor selecionar seu gênero", Toast.LENGTH_SHORT).show();
        } else {
            sexoSelecionado = idSelecionado.getText().toString();
        }


        TextView etNomeReg = findViewById(R.id.etNomeReg);
        String nome = etNomeReg.getText().toString();
        if(nome.isEmpty()){
            validator = true;
            etNomeReg.setError("Este campo deve ser preenchido");
        }

        TextView etEmailReg = findViewById(R.id.etEmailReg);
        String email = etEmailReg.getText().toString();
        if (email.isEmpty()) {
            validator = true;
            etEmailReg.setError("Este campo deve ser preenchido");
        }

        TextView etSenhaReg = findViewById(R.id.etSenhaReg);
        String senha = etSenhaReg.getText().toString();
        if (senha.isEmpty() || senha.length() < 6) {
            validator = true;
            etSenhaReg.setError("Sua senha deve ter 6 digitos ou mais");
        }

        TextView etPhoneReg = findViewById(R.id.etPhoneReg);
        String phone = etPhoneReg.getText().toString();
        if (phone.isEmpty()) {
            validator = true;
            etPhoneReg.setError("Este campo deve ser preenchido");
        }

        TextView etDisciplinaReg = findViewById(R.id.etDisciplinaReg);
        String disciplina = etDisciplinaReg.getText().toString();
        if (disciplina.isEmpty()) {
            validator = true;
            etDisciplinaReg.setError("Este campo deve ser preenchido");
        }

        TextView etTurmaReg = findViewById(R.id.etTurmaReg);
        String turma = etTurmaReg.getText().toString();
        if (turma.isEmpty()) {
            validator = true;
            etTurmaReg.setError("Este campo deve ser preenchdio");
        }

        if (validator == false) {
            Usuario novoUsuario = new Usuario(etNomeReg.getText().toString(), sexoSelecionado, etEmailReg.getText().toString(), etSenhaReg.getText().toString(), etPhoneReg.getText().toString(), etDisciplinaReg.getText().toString(), etTurmaReg.getText().toString());
            usuariosLista.setUsuarioList(novoUsuario);
            startActivity(intent);
        }
    }
}