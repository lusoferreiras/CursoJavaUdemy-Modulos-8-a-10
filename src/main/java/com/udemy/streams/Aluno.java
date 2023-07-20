package com.udemy.streams;

import java.util.Objects;

public class Aluno {

    final String nome;
    final double nota;

    final boolean bomComportamento;

    public Aluno (String nome, double nota){
        this(nome, nota, true);
    }
    public Aluno(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }



    public String toString(){
        return nome + " tem nota "+nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;

        if (Double.compare(aluno.nota, nota) != 0) return false;
        if (bomComportamento != aluno.bomComportamento) return false;
        return nome.equals(aluno.nome);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nome.hashCode();
        temp = Double.doubleToLongBits(nota);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (bomComportamento ? 1 : 0);
        return result;
    }
}
