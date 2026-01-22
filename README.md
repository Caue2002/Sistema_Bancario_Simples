Sistema Bancário Simples — Java
Descrição

Este projeto consiste em um Sistema Bancário Simples desenvolvido em Java, executado via terminal, com o objetivo de praticar Programação Orientada a Objetos (POO), regras de negócio, organização de código e interação com o usuário.

O sistema permite criar contas bancárias e realizar operações básicas como depósito, saque, transferência e consulta de saldo.

Objetivo do Projeto

Consolidar conceitos fundamentais de Java

Praticar encapsulamento, classes, métodos e listas

Simular regras reais de um sistema bancário

Servir como projeto de portfólio para estágio ou nível júnior

Funcionalidades

Criar conta bancária

Depositar valores

Sacar valores com validação de saldo

Transferir valores entre contas

Consultar saldo da conta

Menu interativo no terminal

Conceitos Utilizados

Programação Orientada a Objetos (POO)

Encapsulamento

Construtores

Listas com ArrayList

Estruturas de decisão e repetição

Validação de dados

Separação de responsabilidades

Entrada de dados com Scanner

Estrutura do Projeto
src/
 ├── Main.java     // Menu e interação com o usuário
 ├── Banco.java    // Gerenciamento das contas
 └── Conta.java    // Regras de negócio da conta bancária

Como Executar o Projeto
Pré-requisitos

Java JDK 8 ou superior

IDE (VS Code, IntelliJ ou Eclipse) ou terminal

Passos

Clone o repositório:

git clone https://github.com/seu-usuario/sistema-bancario-java.git


Abra o projeto na sua IDE

Execute o arquivo:

Main.java


Utilize o menu exibido no terminal

Regras de Negócio Implementadas

Não é permitido depositar valores negativos

Não é permitido sacar valores maiores que o saldo disponível

Transferências só ocorrem se ambas as contas existirem

Toda conta inicia com saldo zero

Validações evitam erros de execução e inconsistência de dados

Possíveis Melhorias Futuras

Histórico de transações

Persistência de dados em arquivo

Herança (Conta Corrente e Conta Poupança)

Interface gráfica com Swing ou JavaFX

Testes automatizados

Autor

Cauê Ribeiro Ferreira
Estudante de Análise e Desenvolvimento de Sistemas

Observação

Este projeto foi desenvolvido com fins educacionais, com foco no aprendizado e na prática de conceitos fundamentais de Java e Programação Orientada a Objetos.