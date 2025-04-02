package folha;

public class FuncionarioPadrao extends Funcionario {
    public FuncionarioPadrao(String nome, String cpf, Setor setor, Banco banco, Frequencia frequencia) {
        super(nome, cpf, setor, banco, frequencia);
    }

    @Override
    public double calcularSalario() {
        double base = getSetor().getSalarioBase();
        double bonus = getSetor().getBonus();
        int horasExtras = getFrequencia().getHorasExtras();
        int horasFaltas = getFrequencia().getHorasNaoTrabalhadas();

        double adicional = horasExtras * 20;
        double desconto = horasFaltas * 15;

        return base + bonus + adicional - desconto;
    }
}
