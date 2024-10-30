package com.example.atividade2.model;

public class Filme {
    private String titulo;
    private int ano;
    private String diretor;
    private int posterId;


    public Filme(String titulo, int ano, String diretor, int posterId) {
        this.titulo = titulo;
        this.ano = ano;
        this.diretor = diretor;
        this.posterId = posterId;
    }


    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getPosterId() {
        return posterId;
    }
}

