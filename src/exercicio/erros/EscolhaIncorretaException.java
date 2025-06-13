package exercicio.erros;

public class EscolhaIncorretaException extends Exception {
    public EscolhaIncorretaException(String escolha, String... opcoes){
        super("""
                A escolha "%s", nao e uma das seguintes opcoes validas
                -%s
                """.formatted(escolha, String.join("\n-", opcoes)));
    }
}
