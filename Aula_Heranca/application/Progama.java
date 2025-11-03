package Aula_Heranca.application;

import Aula_Heranca.entities.*;

public class Progama {
    public static void main(String[] args) {
    Pessoas pessoas = new Pessoas();
    Aluno aluno = new Aluno();
    Professor professor = new Professor();
    Funcionario funcionario = new Funcionario();

        //Nome
        pessoas.setNome("Paulo");
        aluno.setNome("Gabriel");
        professor.setNome("Fabiano");
        funcionario.setNome("Samiria");

        //Genero
        pessoas.setGenero("M");
        aluno.setGenero("M");
        professor.setGenero("M");
        funcionario.setGenero("F");

        //Idade
        pessoas.setIdade(20);
        aluno.setIdade(19);
        professor.setIdade(40);
        funcionario.setIdade(50);

        //
        System.out.println(pessoas.toString());
        System.out.println(aluno.toString());
        System.out.println(professor.toString());
        System.out.println(funcionario.toString());
    }
}
