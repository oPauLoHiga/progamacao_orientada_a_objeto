package ProjeN2.application;
import ProjeN2.entities.*;
import java.util.Scanner;

public class Progama_Paulo_Higa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoas_Paulo[] alunos = new Pessoas_Paulo[10];
        int cont = 0;

        while(cont < alunos.length){
            System.out.println("\n**** Cadastro Aluno ****\n");
            System.out.println("Curso: 1- Graduação | 2- Pos-Graduação | 0- Sair");
            int tipoCurso = sc.nextInt();
            sc.nextLine();

            if(tipoCurso == 0){break;}

            System.out.println("Digite o nome do aluno: ");
            String nome = sc.nextLine();
            System.out.println("Digite o cpf do aluno: ");
            String cpf = sc.nextLine();
            System.out.println("Digite o matricula do aluno: ");
            String matricula = sc.nextLine();

            if (tipoCurso == 1){
                System.out.println("Digite o nome da Graduação: ");
                String curso = sc.nextLine();
                alunos[cont] = new Graduacao_Paulo(nome,cpf,matricula,curso);
            } else if(tipoCurso == 2){
                System.out.println("Digite o nome da Pôs-Graduação: ");
                String curso = sc.nextLine();
                alunos[cont] = new PosGraduacao_Paulo(nome,cpf,matricula,curso);
            }
            cont++;
        }
        System.out.println("---- Alunos Cadastrados ----");
        for(int i = 0; i < cont; i++){
            System.out.println("\nAlunos "+ (i+1));
            System.out.println(alunos[i]);
            System.out.println("-----------------------------------");
        }
        sc.close();
    }
}