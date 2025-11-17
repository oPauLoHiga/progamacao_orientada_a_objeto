package br.com.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConexaoMySQL {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/aula_java?useSSL=false&serverTimezone=UTC";
        String usuario = "root";
        String senha = "31415"; // sua senha do MySQL

        try {
            Connection conexao = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Conexão bem-sucedida!");

            Statement stmt = conexao.createStatement();
            Scanner scanner = new Scanner(System.in);

// Loop para cadastro múltiplo
            while (true) {
                System.out.print("Digite o nome (ou 'sair' para encerrar): ");
                String nome = scanner.nextLine();

                if (nome.equalsIgnoreCase("sair")) {
                    break; // sai do loop se digitar 'sair'
                }

                System.out.print("Digite o e-mail: ");
                String email = scanner.nextLine();

                String sql = "INSERT INTO usuarios (nome, email) VALUES ('" + nome + "', '" + email + "')";
                stmt.executeUpdate(sql);

                System.out.println("Usuário inserido com sucesso!\n");
            }

// Exibe todos os usuários cadastrados

            System.out.println("\nLista completa de usuários cadastrados:");
            ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("--------------------------");
            }

            rs.close();
            stmt.close();
            conexao.close();
            scanner.close();

        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante a conexão ou consulta:");
            e.printStackTrace();
        }
    }
}