package Atividade_Animal.Entidades;

public class Animal {
    private String nome;
    private int idade;

    public void fazerSom(){System.out.println("O animal faz som:");}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public int getIdade() {return idade;}

    public void setIdade(int idade) {this.idade = idade;}

    @Override
    public String toString() {
        return "Animal: " +
                "nome='" + nome + '\'' +
                ", idade=" + idade ;
    }
}
