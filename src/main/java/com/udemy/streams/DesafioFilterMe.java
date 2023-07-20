package com.udemy.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static com.udemy.streams.Instituto.Curso.*;

/*
1. Criar duas funções lambdas
2. Realizar dois filter nessas funções
3. Usar um Map no final
 */
public class DesafioFilterMe {

    public static void main(String[] args) {

    Instituto aluno1 = new Instituto("Roger", 18, "Limoeiro", MECANICA);
    Instituto aluno2 = new Instituto("Jenifer", 21, "Limoeiro", ENFERMAGEM);
    Instituto aluno3 = new Instituto("Fernada", 26, "Limoeiro", MUSICA);
    Instituto aluno4 = new Instituto("Augusto", 29, "Limoeiro", MACENARIA);
    Instituto aluno5 = new Instituto("Linda", 31, "Limoeiro", MECANICA);
    Instituto aluno6 = new Instituto("Jamal", 17, "Limoeiro", MUSICA);
    Instituto aluno7 = new Instituto("Ricardo", 19, "Limoeiro", ENFERMAGEM);

    List<Instituto> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7);

    Predicate<Instituto> maiorIdade = a -> a.idadeAluno > 21;
    Function<Instituto, String> adultos = a -> "O aluno "+a.nomeAluno+" é seu próprio responsável";
    Function<Instituto, String> alunosMusica = a -> "Alunos: "+Instituto.Curso.valueOf(MUSICA.name());

        System.out.println("Alunos maiores de idade: ");
        alunos.stream()
                .filter(maiorIdade)
                .map(adultos)
                .forEach(System.out::println);

        System.out.println("\nCurso de música:");
        alunos.stream()
                .map(alunosMusica);
    }




}
