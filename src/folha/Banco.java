package folha;

public class Banco {
    private String nome;
    private String numero;

    public Banco(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public void mostrarBanco() {
        System.out.println(nome + " (Código: " + numero + ")");
    }
}