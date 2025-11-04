package Aula_Heranca.entities;

public class Pessoas {
    private String nome;
    private int idade;
    private String genero;

    public void aniversario(){
        this.idade++;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public String getGenero() {return genero;}
    public void setGenero(String genero) {this.genero = genero;}

}
