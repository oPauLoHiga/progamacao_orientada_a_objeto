package N1_Projeto;

import java.util.Scanner;

public class n1_at2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] pedidos = new String[2];
        int[] quantidades = new int[2];
        double[] valor_produto = new double[2];

        System.out.println("Digite o numero da mesa (0 a 50): ");
        int mesa = sc.nextInt();
    if ( mesa < 0 || mesa > 50){
        System.out.println("MESA INVALIDA!!");
    } else {

        for (int i = 0; i < pedidos.length; i++) {
            System.out.printf("\nEscreva o %d pedido ", i + 1);
            pedidos[i] = sc.next();

            System.out.println("Digite a quantidade ");
            quantidades[i] = sc.nextInt();
            if(quantidades[i] < 0 ){
                System.out.println("Quantidade invalida!!");
            }else {
                System.out.println("Qual o valor do produto ");
                valor_produto[i] = sc.nextDouble();
                if (valor_produto[i] < 0.00){
                    System.out.println("Valor invalido!!");
                }
            }
        }
        System.out.print("***********************");
        System.out.println("\nCONTA DA MESA " + mesa);
        System.out.print("***********************");
        double valor_total = 0;

        for (int i = 0; i < 2; i++) {
        double subtotal = valor_produto[i] * quantidades[i];
        valor_total += subtotal;

            System.out.printf("\nPedido: %s\nQuantidade: %d\nValor unitario: %.2f\nValor: %.2f\n",pedidos[i], quantidades[i], valor_produto[i], subtotal);
            System.out.print("***********************");
        }
        System.out.printf("\nValor total: %.2f", valor_total);
     }

        sc.close();
    }
}
