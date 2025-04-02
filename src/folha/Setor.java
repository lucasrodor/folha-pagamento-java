package folha;

public class Setor {
    private String nome;
    private double salarioBase;
    private double bonus;

    public Setor(String nome, double salarioBase, double bonus) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getBonus() {
        return bonus;
    }

    public void mostrarSetor() {
        System.out.println("Setor: " + nome);
    }
}