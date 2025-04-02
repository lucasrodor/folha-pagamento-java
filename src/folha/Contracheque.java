package folha;

public class Contracheque {
    private Funcionario funcionario;
    private double salarioFinal;

    public Contracheque(Funcionario funcionario) {
        this.funcionario = funcionario;
        this.salarioFinal = funcionario.calcularSalario();
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void exibirResumo() {
        System.out.println("Funcionario: " + funcionario.getNome());
        System.out.println("Setor: " + funcionario.getSetor().getNome());
        System.out.println("Banco: " + funcionario.getBanco().getNome());
        System.out.printf("Salario Final: R$%.2f\n", salarioFinal);
        System.out.println("---------------------------");
    }
}