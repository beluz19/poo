package exercicio.heranca;

public class Husky extends Cao{
    private String racao;
    
    public String getRacao() {
        return racao;
    }

    public void setRacao(String racao) {
        this.racao = racao;
    }

    @Override
    public String getAlimentacao() {
        return super.getAlimentacao() + racao;
    }

    public void porte(int altura){
        System.out.println("%i".formatted(altura));
    }

    public void porte(int altura, int largura){
        System.out.println("%i".formatted(altura));
    }
}
