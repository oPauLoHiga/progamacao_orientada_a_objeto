package N1_Projeto;

import java.util.Scanner;

public class n1_at1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dgite seu nome: ");
        String nome_prof = sc.nextLine();

        System.out.print("Dgite o nome do(a) aluno(a): ");
        String nome_aluno = sc.nextLine();

        System.out.print("Digite a 1° nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a 2° nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (nota1 > 10 || nota1 < 0 || nota2 > 10 || nota2 < 0) {
            System.out.println("NOTA INVALIDA!!!\nA NOTA DEVE SER ENTRE (0 e 10)!!!");
        }else {
            System.out.println("**************************************");
            System.out.printf("*  PROFESSOR:%s\n*  ALUNO: %s\n*  1°NOTA: %.2f | 2°NOTA: %.2f\n*  MEDIA: %.2f\n",nome_prof , nome_aluno , nota1, nota2, media);
            System.out.println("**************************************");
        sc.close();
        }
    }
}
