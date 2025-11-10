package Projeto_N2.entities;

public class Graduacao_Paulo_GabrielJoao_Gabriel_Joao extends Pessoa_Paulo_Gabriel_Joao {
    private String cursoGraduacao;

    public String getCursoGraduacao() {return cursoGraduacao;}
    public void setCursoGraduacao(String cursoGraduacao) {this.cursoGraduacao = cursoGraduacao;}

    @Override
    public String toString() {
        return "** Graduação **\nNome :" + getNome() +
                "\nCPF:"+ getCpf() +"\nMatricula: "+ getMatricula() +
                "\nCurso de Graduação: " + cursoGraduacao;
    }
}
