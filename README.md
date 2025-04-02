# Sistema de Folha de Pagamento - Java

Este é um projeto simples feito em Java que simula o funcionamento básico da folha de pagamento de uma transportadora fictícia chamada **Pé na Estrada**.

---

## 🚀 Funcionalidades

- Cadastro fixo de funcionários
- Cálculo do salário com base no setor, horas extras e faltas
- Geração de contracheques
- Impressão dos contracheques em ordem de setor
- Geração da ordem de pagamento por banco

---

## 🧠 Estrutura do Projeto

O projeto está estruturado com classes separadas para cada conceito do sistema:

- `Setor.java` → Define nome, salário base e bônus de cada setor
- `Banco.java` → Representa o banco onde o funcionário recebe
- `Frequencia.java` → Guarda as horas extras, faltas, férias e licenças
- `Funcionario.java` → Classe abstrata base para qualquer funcionário
- `FuncionarioPadrao.java` → Funcionário comum com cálculo padrão de salário
- `Contracheque.java` → Calcula e imprime o resumo de pagamento
- `Principal.java` → Classe com o método `main` que executa o sistema

---

## ▶️ Como Executar

1. Importe o projeto no Eclipse (ou outro editor Java)
2. Abra o arquivo `Principal.java`
3. Execute o `main`
4. O resultado será exibido no console, com os contracheques e totais por banco

---

## 📁 Desenvolvido por
- Lucas Rodor
    Linkedin: [Lucas Rodor](https://www.linkedin.com/in/lucasrodor/)
    Github: [Lucas Rodor](https://github.com/lucasrodor)
- Luigi Ajello
    Linkedin: [Luigi Ajello](www.linkedin.com/in/luigi-pedroso-ajello-346934278/)
    Github: [Luigi Ajello](https://github.com/LuigiAjello)
- Pedro Arthur
    Linkedin: [Pedro Arthur](https://www.linkedin.com/in/pedro-arthur-da-luz-miranda-4a94a5301/)
    Github: [Pedro Arthur](https://github.com/pedrocadaluz)




