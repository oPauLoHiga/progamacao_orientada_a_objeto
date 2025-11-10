package Aula_Heranca.entities;

public class Professor extends Pessoas {
    private Float salario;
    private String especialidade;

    public void receberAumento(float aumento){
        this.salario += aumento;
    }

    public double getSalario() {return salario;}
    public void setSalario(float salario) {this.salario = salario;}

    public String getEspecialidade() {return especialidade;}
    public void setEspecialidade(String especialidade) {this.especialidade = especialidade;}

    @Override
    public String toString() {
        return "Professor [nome=" + getNome() + ", idade=" + getIdade() + ", genero=" + getGenero() + ", especialidade=" + especialidade + ", salario=" + salario + "]";
    }

}
