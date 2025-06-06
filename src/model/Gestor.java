package model;

public class Gestor extends Trabalhador{
    private int bonus;

    public int getBonus(){
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getSalario() {
        return super.getSalario() + bonus;
    }

    @Override
    public String toString() {
        return "Gestor [bonus=" + bonus + ", super()=" + super.toString() + "]";
    }

    
}