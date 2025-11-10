package ProjeN2.application;
import ProjeN2.entities.*;
import java.util.Scanner;

public class Progama_Paulo_Gabriel_Joao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        Pessoa_Paulo_Gabriel_Joao[] alunos = new Pessoa_Paulo_Gabriel_Joao[10];
        int cont = 0;
        do {
            System.out.println("Escolha o tipo de cadastro:");
            System.out.println("1. Graduação");
            System.out.println("2. Pós-Graduação");
            System.out.println("3. Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            if (opcao == 3) {break;
            }
            System.out.println("Digite o Nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite o CPF: ");
            String cpf = sc.nextLine();
            System.out.println("Digite a MATRICULA: ");
            String matricula = sc.nextLine();

            switch (opcao) {
                case 1:
                    Graduacao_Paulo_GabrielJoao_Gabriel_Joao graduacao = new Graduacao_Paulo_GabrielJoao_Gabriel_Joao();
                    graduacao.setNome(nome);
                    graduacao.setCpf(cpf);
                    graduacao.setMatricula(matricula);
                    System.out.println("Digite sua Graduação: ");
                    String cursoGraduacao = sc.nextLine();
                    graduacao.setCursoGraduacao(cursoGraduacao);
                    alunos[cont] = graduacao;
                    cont++;
                    break;
                case 2:
                    PosGraduacao_Paulo_Gabriel_Joao posgraduacao = new PosGraduacao_Paulo_Gabriel_Joao();
                    posgraduacao.setNome(nome);
                    posgraduacao.setCpf(cpf);
                    posgraduacao.setMatricula(matricula);
                    System.out.println("Digite o nome da sua Pós-Gradução: ");
                    String cursoPos = sc.nextLine();
                    posgraduacao.setCursoPosGraduacao(cursoPos);
                    alunos[cont] = posgraduacao;
                    cont++;
                    break;
            }
        }  while (opcao != 4);
            System.out.println("-----------------------------------");
            for (int i = 0; i < cont; i++) {
                System.out.println("Alunos " + (i + 1));
                System.out.println(alunos[i].toString());
                System.out.println("-----------------------------------");
            }
            sc.close();
        }
}