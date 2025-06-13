package exercicio.utilitarios;

import java.util.Random;

public class Aleatoriedade {
    public static void main(String[] args) {
        var random = new Random();

        int valorAleatorio = random.nextInt();
        System.out.println("int aleatorio: %s".formatted(valorAleatorio));

        int valorAleatorio2 = random.nextInt(100);
        System.out.println("int aleatorio maximo 100: %s".formatted(valorAleatorio2));

        double valorAleatorio3 = random.nextDouble();
        System.out.println("double aleatorio: %s".formatted(valorAleatorio3));

        double valorAleatorio4 = random.nextDouble(100);
        System.out.println("double aleatorio maximo 100: %s".formatted(valorAleatorio4));





    }
}
