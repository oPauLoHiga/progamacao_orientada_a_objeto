package Aula_Heranca.entities;

public class Aluno extends Pessoas{
    private String matricula;
    private String curso;

    public void cancelarMatricula(){
        System.out.println("Matricula cancelada");
    }

    public String getMatricula() {return matricula;}
    public void setMatricula(String matricula) {this.matricula = matricula;}

    public String getCurso() {return curso;}
    public void setCurso(String curso) {this.curso = curso;}
}
