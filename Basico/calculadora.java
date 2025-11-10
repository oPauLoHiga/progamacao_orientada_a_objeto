package Basico;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        double resultado = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o 1º valor: ");
        double valor1 = sc.nextDouble();

        System.out.print("Digite (+ - * /): ");
        char operacao = sc.next().charAt(0);

        System.out.println("Digite o 2º valores: ");
        double valor2 = sc.nextDouble();

        if (operacao == '+') {
            resultado = valor1 + valor2;
        }
        else if (operacao == '-') {
            resultado = valor1 - valor2;
        }
        else if (operacao == '*') {
            resultado = valor1 * valor2;
        }
        else if (operacao == '/') {
            if (valor2 != 0) {
                resultado = valor1 / valor2;
            }
            else {
                System.out.println("ERRO! Operação invalida.");
                return;
            }
        }

        System.out.printf("Seu resultado é: %.2f", resultado);

        sc.close();
    }
}