package com.example.corridaapp.services;

import com.example.corridaapp.models.UsuariosLista;

public class AuthService{

    public AuthService(){
    }

    public Boolean validarLogin(String email, String senha) {
        UsuariosLista usuariosLista = new UsuariosLista();
        if (!usuariosLista.getUsuarioList().isEmpty()){
            if (usuariosLista.getUsuario(email).getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }
}
