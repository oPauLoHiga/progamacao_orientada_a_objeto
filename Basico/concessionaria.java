package Basico;

import java.util.Scanner;

public class concessionaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a marca: Chevrolet, Fiat ou Hyundai");
        String marca = sc.nextLine().toLowerCase(); // converte tudo para minúsculo
            if (marca.equals("chevrolet")){
                System.out.println("carros Crevrolet: onix / tracker / s10");
            }   else if (marca.equals("fiat")){
                     System.out.println("Carros Fiat: argo / cronos / toro");
                }   else if (marca.equals("hyundai")){
                     System.out.println("Carros Hyundai: hb20 / creta / tucson");
                    }
                        else {
                            System.out.println("Escolha invalida!!");
                        }

        System.out.println("Digite o modelo do carro:");
        String modelo = sc.nextLine().toLowerCase();
        switch (marca) {
            case "chevrolet" :
                if (modelo.equals("onix") || modelo.equals("tracker") || modelo.equals("s10")) {
                    System.out.printf("Seu carro é o %s da marca Chevrolet.", modelo);
                } else {
                    System.out.println("Modelo inválido para Chevrolet!");
                }
                break;
            case "fiat":
                if (modelo.equals("argo") || modelo.equals("cronos") || modelo.equals("toro")) {
                    System.out.printf("Seu carro é o %s da marca Fiat.", modelo);
                } else {
                    System.out.println("Modelo inválido para Fiat!");
                }
                break;
            case "hyundai":
                if (modelo.equals("hb20") || modelo.equals("creta") || modelo.equals("tucson")) {
                    System.out.printf("Seu carro é o %s da marca Hyundai.", modelo);
                } else {
                    System.out.println("Modelo inválido para Hyundai!");
                }
                break;
            default:
                System.out.println("Marca inválida!");
        }
        sc.close();
    }
}
