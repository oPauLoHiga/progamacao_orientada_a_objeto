package ProjeN2.entities;

public class PosGraduacao_Paulo_Gabriel_Joao extends Pessoa_Paulo_Gabriel_Joao {
    private String cursoPosGraduacao;

    public String getCursoPosGraduacao() {
        return cursoPosGraduacao;
    }
    public void setCursoPosGraduacao(String cursoPosGraduacao) {
        this.cursoPosGraduacao = cursoPosGraduacao;
    }

    @Override
    public String toString() {
        return "** Pós-Graduação **\nNome :" + getNome() +
                "\nCPF:"+ getCpf() +"\nMatricula: "+ getMatricula() +
                "\nCurso Pós-Graduação: " + cursoPosGraduacao;
    }
}
