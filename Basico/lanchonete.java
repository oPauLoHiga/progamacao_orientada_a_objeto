package Basico;

import java.util.Scanner;
// teste

public class lanchonete {
    public static void main(String[] args) {
        double valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da escolha: \n1 - cachorro quente / 2 - X-Salada / 3 - X-Baicon / 4 - Torrada simplis / 5 - Refrigerante");
        int escolha  = sc.nextInt();
        if (escolha == 1) {
            valor = 4.0;
            System.out.println("Sua escolha foi: cachorro quente");
        } else if (escolha == 2) {
            valor = 4.5;
            System.out.println("Sua escolha foi: X-Salada");
        } else if (escolha == 3) {
            valor = 5.0;
            System.out.println("Sua escolha foi: X-Baicon");
        } else if (escolha == 4) {
            valor = 2.0;
            System.out.println("Sua escolha foi: Torrada simplis");
        } else if (escolha == 5) {
            valor = 1.5;
            System.out.println("Sua escolha foi: Refrigerante");
        } else {
            System.out.println("ERRO! escolha invalida.");
            return;
        }
        System.out.println("Digite a quantidade que voce quer: ");
        double quantidade = sc.nextDouble();

        double total = valor * quantidade;

        System.out.printf("O valor total da compra foi: R$%.2f", total);
        sc.close();
    }
}

