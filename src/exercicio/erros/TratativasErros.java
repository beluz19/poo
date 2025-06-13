package exercicio.erros;

import java.util.Scanner;

public class TratativasErros {
    public static void main(String[] args) {

        try {
            var entrada = new Scanner(System.in);
            String[] opcoes = {"bola", "carro", "escada"};
            System.out.println("Digite uma das seguintes opcoes %s".formatted(String.join(", ", opcoes)));
            String escolha = entrada.nextLine().trim();

            if(!opcoes[0].equalsIgnoreCase(escolha)
                    && !opcoes[1].equalsIgnoreCase(escolha)
                    && !opcoes[2].equalsIgnoreCase(escolha)) {
                throw new EscolhaIncorretaException(escolha, opcoes);
            }
        } catch (EscolhaIncorretaException e) {
            e.printStackTrace();
        }

    }

    private void testeTryCacht() {
        try {
            var entrada = new Scanner(System.in);
            System.out.println("Digite um numero: ");
            int num1 = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("O valor digitado deve ser um numero!");
        }

        System.out.println("FIM");
    }

}
