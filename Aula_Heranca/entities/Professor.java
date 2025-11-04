package Aula_Heranca.entities;

public class Professor extends Pessoas {
    private double salario;
    private String especialidade;

    public void receberAumento(double aumento){
        this.salario += aumento;
    }

    public double getSalario() {return salario;}

    public void setSalario(double salario) {this.salario = salario;}

    public String getEspecialidade() {return especialidade;}

    public void setEspecialidade(String especialidade) {this.especialidade = especialidade;}

    @Override
    public String toString() {
        return "Professor [nome=" + getNome() + ", idade=" + getIdade() + ", genero=" + getGenero() + ", especialidade=" + especialidade + ", salario=" + salario + "]";
    }

}
