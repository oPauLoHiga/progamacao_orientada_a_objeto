package Aula_Polimorfismo.entities;

public class Empregados {
    private String nome;
    private Integer horasTrab;
    private Double valorHora;

    public Empregados(String nome, Integer horasTrab, Double valorHora) {
        this.nome = nome;
        this.horasTrab = horasTrab;
        this.valorHora = valorHora;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public Integer getHorasTrab() {return horasTrab;}
    public void setHorasTrab(Integer horasTrab) {this.horasTrab = horasTrab;}

    public Double getValorHora() {return valorHora;}
    public void setValorHora(Double valorHora) {this.valorHora = valorHora;}

//método de pagamento
    public double pagamento() {
        return horasTrab * valorHora;
    }
}