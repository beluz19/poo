package model;

public class Endereco {
    private String rua;
    private String cidade;
    private String cep;
    private Estados estado;
   
    public Endereco() {
    }

    public Endereco(String rua, String cidade, String cep, Estados estado) {
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

    
}
