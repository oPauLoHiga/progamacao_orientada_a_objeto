package Aula_Polimorfismo.entities;

public class empregadosTerceirizados extends Empregados{
    private Double despesaAdicional;

    public empregadosTerceirizados(String nome, Integer horasTrab, Double valorHora, Double despesaAdicional) {
        super(nome, horasTrab, valorHora);
        this.despesaAdicional = despesaAdicional;
    }

    public Double getDespesaAdicional() {return despesaAdicional;}
    public void setDespesaAdicional(Double despesaAdicional) {this.despesaAdicional = despesaAdicional;}

    @Override
    public double pagamento() {
//super.pagamento = pagamento normal da super class
        return super.pagamento() + despesaAdicional * 1.1;

    }

}