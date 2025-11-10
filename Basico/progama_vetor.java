package Basico;
import java.util.Scanner;
public class progama_vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] valor = new double[4];
        String [] produto = new String [4];

        //CADASTRO
        for (int i = 0; i < produto.length; i++) {
            System.out.printf("Digite o %d nome do produto: ", i + 1);
            produto[i] = sc.nextLine();
            System.out.printf("Digite o %d valor do produto: ", i + 1);
            valor[i] = sc.nextDouble();
            sc.nextLine();
        }

        //SOMA
        double total = 0;
        for (int i = 0; i < produto.length; i++) {
            total += valor[i];
        }

        //IMPRESSÃO
        for (int i = 0; i < 4; i++){
            System.out.printf("Produto: %s | Valor: %.2f%n", produto[i], valor[i]);
        }
        System.out.printf("Total: R$ %.2f%n%n", total);
        sc.close();
    }
}