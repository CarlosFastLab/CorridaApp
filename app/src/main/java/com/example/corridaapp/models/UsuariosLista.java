package com.example.corridaapp.models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class UsuariosLista {
    private static final List<Usuario> usuarioList = new ArrayList<Usuario>();

    public UsuariosLista() {

    }

    public void setUsuarioList(Usuario usuario) {
        this.usuarioList.add(usuario);
    }

    public Usuario getUsuario(String email) {
        for (Usuario usuario : usuarioList) {
            if(usuario.getEmail().equals(email)) {
                return usuario;
            }
        }
        return null;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public List<String> listaPorEmail() {
        List<String> listadeUsuarios = new ArrayList<>();
        for (Usuario usuario : usuarioList) {
            listadeUsuarios.add(usuario.getEmail());
        }
        return listadeUsuarios;
    }
}
