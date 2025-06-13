package exercicio.utilitarios;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Nome: %s Idade: %s".formatted(nome, idade));
    }
}
