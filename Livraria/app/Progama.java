package Livraria.app;
import Livraria.entities.Livro;

import java.util.Scanner;

public class Progama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //cadastro

        System.out.println("Titulo do Livro");
        String titulo = sc.nextLine();

        System.out.println("Autor:");
        String autor = sc.nextLine();

        System.out.println("Preço: ");
        double preco = sc.nextDouble();

        Livro livro = new Livro(titulo, autor, preco);

        //impressão
        System.out.println(livro);

        sc.nextLine();
        System.out.println("\nNovo titulo do livro: ");
        String novoTitulo = sc.nextLine();
        livro.setTitulo(novoTitulo);

        System.out.println("Novo Autor: ");
        String novoAutor = sc.nextLine();
        livro.setAutor(novoAutor);

        System.out.println("Novo preço: ");
        double novoPreco = sc.nextDouble();
        livro.setPreco(novoPreco);

        System.out.println(livro);

        sc.close();
    }
}
