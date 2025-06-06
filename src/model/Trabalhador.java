package model;

public class Trabalhador extends Pessoa {
    private String ocupacao;
    private int salario;

    public Trabalhador() {
    }

    public Trabalhador(
            String nome,
            int idade,
            String cidade,
            String email,
            String ocupacao,
            int salario) {
        super(nome, idade, cidade, email);
        this.ocupacao = ocupacao;
        this.ocupacao = ocupacao;
    }

    public Trabalhador(
            Long id,
            String nome,
            int idade,
            String cidade,
            String email,
            Endereco endereco,
            String ocupacao,
            int salario) {
        super(nome, idade, cidade, email);
        this.ocupacao = ocupacao;
        this.salario = salario;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public int getSalario() {
        return salario;
    }


    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setSalario(float salario){
        this.salario = (int) salario;
    }

    public void setSalario(double salario){
        this.salario = (int) salario;
    }

    @Override
    public String toString() {
        return "Trabalhador [ocupacao=" + ocupacao + ", salario=" + salario + ", super()=" + super.toString() + "]";
    }

    
}
