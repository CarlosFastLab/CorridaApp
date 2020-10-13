package com.example.corridaapp.models;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String nome;
    private String sexo;
    private String email;
    private String senha;
    private String phone;
    private String disciplina;
    private String turma;

    public Usuario(String nome, String sexo, String email, String senha, String phone, String disciplina, String turma) {
        this.nome = nome;
        this.sexo = sexo;
        this.email = email;
        this.senha = senha;
        this.phone = phone;
        this.disciplina = disciplina;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() { return senha; }

    public void setSenha(String senha) { this.senha = senha; }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
