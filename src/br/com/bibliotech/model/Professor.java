package br.com.bibliotech.model;

public final class Professor extends Usuario{

    public Professor(String nome, String login, String senha) {
        super.nome = nome;
        super.login = login;
        super.senha = senha;
        super.tipoUsuario = "professor";
    }
}
