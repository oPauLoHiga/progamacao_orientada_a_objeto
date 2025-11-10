package Aula_Polimorfismo.aplication;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Aula_Polimorfismo.entities.Empregados;
import Aula_Polimorfismo.entities.empregadosTerceirizados;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Empregados> list = new ArrayList<>();

        System.out.println("Quantos funcionários serão cadastrados?");
        int n = sc.nextInt();

//CADASTRO DOS FUNCIONÁRIOS
        for (int i=1; i<=n; i++) {
            System.out.println(i + "º EMPREGADO(A) Terceirizado(s/n)?");
            char opcao = sc.next().charAt(0); //receber apenas uma letra

            System.out.println("NOME: ");
            sc.nextLine(); //preencher a linha vazia antes do String
            String nome = sc.nextLine();

            System.out.println("Horas Trabalhadas: ");
            int horasTrab = sc.nextInt();

            System.out.println("valor por hora: ");
            double valorHora = sc.nextDouble();

//SE FOR TERCEIRIZADO
            if (opcao == 's') {
                System.out.print("Despesa Adicional");
                double despesaAdicional = sc.nextDouble();
                list.add(new empregadosTerceirizados(nome, horasTrab, valorHora, despesaAdicional));

            }else {
                list.add(new Empregados(nome, horasTrab, valorHora));
            }
        }
        System.out.println();
        System.out.println("Pagamento");
//IMPRESÃO

        for (Empregados empregado : list) {
            System.out.println(empregado.getNome() + empregado.pagamento());
//ou
            System.out.println("NOME: " + empregado.getNome() + "\n$: " +String.format("%.2f", empregado.pagamento()));
        }
        sc.close();
    }
}