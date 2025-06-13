package exercicio.utilitarios;

import java.util.Random;
import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        //instanciar o scanner
        //pedir 1 numero
        //pedir outro numero
        //responder o minimo entre eles
        //responder o randomico

        var entrada = new Scanner(System.in);
        var random = new Random();

        System.out.println("DIGITE UM NUMERO: ");
        int numero = entrada.nextInt();
        System.out.println("DIGITE OUTRO NUMERO: ");
        int numero2 = entrada.nextInt();

        int minimoValor = Math.min(numero, numero2);
        System.out.println("MINIMO VALOR: %s".formatted(minimoValor));

        int randomico = random.nextInt(minimoValor);
        System.out.println("int randomico: %s".formatted(randomico));
    }
}
