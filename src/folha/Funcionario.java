package folha;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private Setor setor;
    private Banco banco;
    private Frequencia frequencia;

    public Funcionario(String nome, String cpf, Setor setor, Banco banco, Frequencia frequencia) {
        this.nome = nome;
        this.cpf = cpf;
        this.setor = setor;
        this.banco = banco;
        this.frequencia = frequencia;
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public Setor getSetor() {
        return setor;
    }

    public Banco getBanco() {
        return banco;
    }

    public Frequencia getFrequencia() {
        return frequencia;
    }
}
