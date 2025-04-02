package folha;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Setor rh = new Setor("Recursos Humanos", 3500.00, 500.00);
        Setor atendimento = new Setor("Atendimento", 2800.00, 300.00);
        Setor coleta = new Setor("Coleta", 3200.00, 400.00);
        Setor diretoria = new Setor("Diretoria", 8000.00, 1200.00);
        Setor marketing = new Setor("Marketing", 3500.00, 500.00);

        Banco bancoA = new Banco("Banco do Brasil", "001");
        Banco bancoB = new Banco("Itaú", "237");
        Banco bancoC = new Banco("Nubank","133");

        Funcionario f1 = new FuncionarioPadrao("Ana", "111.111.111-11", rh, bancoA, new Frequencia(5, 2, false, false));
        Funcionario f2 = new FuncionarioPadrao("Bruno", "222.222.222-22", atendimento, bancoB, new Frequencia(2, 0, false, false));
        Funcionario f3 = new FuncionarioPadrao("Carlos", "333.333.333-33", coleta, bancoA, new Frequencia(0, 3, false, false));
        Funcionario f4 = new FuncionarioPadrao("Diana", "444.444.444-44", rh, bancoB, new Frequencia(4, 0, false, false));
        Funcionario f5 = new FuncionarioPadrao("Eduardo", "555.555.555-55", diretoria, bancoA, new Frequencia(1, 1, false, false));

        Funcionario[] funcionarios = {f1, f2, f3, f4, f5};

        System.out.println("=== CONTRACHEQUES ORDENADOS POR SETOR ===\n");
        Contracheque[] contracheques = new Contracheque[funcionarios.length];

        for (int i = 0; i < funcionarios.length; i++) {
            contracheques[i] = new Contracheque(funcionarios[i]);
        }

        for (int i = 0; i < contracheques.length - 1; i++) {
            for (int j = i + 1; j < contracheques.length; j++) {
                String setorI = contracheques[i].getFuncionario().getSetor().getNome();
                String setorJ = contracheques[j].getFuncionario().getSetor().getNome();
                if (setorI.compareTo(setorJ) > 0) {
                    Contracheque temp = contracheques[i];
                    contracheques[i] = contracheques[j];
                    contracheques[j] = temp;
                }
            }
        }

        for (int i = 0; i < contracheques.length; i++) {
            contracheques[i].exibirResumo();
        }

        System.out.println("=== ORDEM DE PAGAMENTO POR BANCO ===\n");

        String[] nomesBancos = {"Banco do Brasil", "Itaú"};
        double[] totais = new double[nomesBancos.length];

        for (int i = 0; i < funcionarios.length; i++) {
            String nomeBanco = funcionarios[i].getBanco().getNome();
            double salario = funcionarios[i].calcularSalario();

            for (int j = 0; j < nomesBancos.length; j++) {
                if (nomeBanco.equals(nomesBancos[j])) {
                    totais[j] += salario;
                }
            }
        }

        for (int i = 0; i < nomesBancos.length; i++) {
            System.out.printf("Banco: %s - Total a Pagar: R$%.2f\n", nomesBancos[i], totais[i]);
        }
    }
}

