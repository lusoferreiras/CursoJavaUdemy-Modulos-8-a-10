package com.udemy.streams;

public class Instituto {

    final String nomeAluno;
    final Integer idadeAluno;
    final String cidade;
    private final Instituto.Curso Curso;

    public enum Curso {
        ENFERMAGEM, MECANICA, MACENARIA, MUSICA
    };

    public Instituto(String nomeAluno, Integer idadeAluno, String cidade, Curso curso) {
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
        this.cidade = cidade;
        this.Curso = curso;
    }
}
