package model;

public class Pessoa {
    // public - protected - private
    private Long id;
    private String nome;
    private int idade;
    private String cidade;
    private String email;
    private Endereco endereco;
    private boolean dependentes;

    public Pessoa(){}

    public Pessoa(String nome, int idade, String cidade, String email){
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.email = email;
    }

    public Pessoa(Long id, String nome, int idade, String cidade, String email, Endereco endereco){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.email = email;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public boolean hasDependentes() {
        return dependentes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setDependentes(boolean dependentes) {
        this.dependentes = dependentes;
    }

    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" + idade + ", cidade=" + cidade + ", email=" + email
                + ", endereco=" + endereco + ", dependentes=" + dependentes + "]";
    }

    

    
}
