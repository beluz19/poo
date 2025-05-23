import model.Endereco;
import model.Estados;
import model.Pessoa;
import util.ClonarEndereco;

public class App {
    public static void main(String[] args) throws Exception {
        
        var pessoa = new Pessoa(
        "Bernardo Luz",
         19, 
         "Novo Hamburgo", 
         "bernardo.pacheco@gamil.com");

        System.out.println("Nome: %s".formatted(pessoa.getNome()));

        var endereco1 = new Endereco("Rua B", "NH", "45652-000", Estados.RS);
        pessoa.setEndereco(endereco1);

        pessoa.setNome("Bernardo Pacheco");
        System.out.println("Nome: %s".formatted(pessoa.getNome()));

        var pessoa2 = new Pessoa();

        pessoa2.setNome("Ana");
        pessoa2.setIdade(21);
        pessoa2.setCidade("Novo Hamburgo");
        pessoa2.setEmail("ana.l@gmail.com");
        pessoa2.setEndereco(new ClonarEndereco().clonar(endereco1));

        System.out.println("Nome: %s".formatted(pessoa2.getNome()));
        pessoa2.setNome("Luisa");
        System.out.println("Nome: %s".formatted(pessoa2.getNome()));

        String cep = pessoa.getEndereco().getCep();
        System.out.println("CEP: %s".formatted(cep));
        
        String cep2 = pessoa2.getEndereco().getCep();
        System.out.println("CEP: %s".formatted(cep2));

        pessoa2.getEndereco().setCep("55555-000");
        System.out.println("CEP 1 = %s".formatted(pessoa.getEndereco().getCep()));
        System.out.println("CEP 2 = %s".formatted(pessoa2.getEndereco().getCep()));

    }
}
