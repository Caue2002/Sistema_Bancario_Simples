import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        int opcao;

        do {
            System.out.println("\n=== SISTEMA BANCÁRIO ===");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Consultar saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome do titular: ");
                    String nome = scanner.nextLine();
                    Conta conta = banco.criarConta(nome);
                    System.out.println("Conta criada com sucesso!");
                    System.out.println("Número da conta: " + conta.getNumeroConta());
                    break;

                case 2:
                    System.out.print("Número da conta: ");
                    int numDeposito = scanner.nextInt();
                    System.out.print("Valor: ");
                    double valorDeposito = scanner.nextDouble();

                    Conta contaDeposito = banco.buscarConta(numDeposito);
                    if (contaDeposito != null && contaDeposito.depositar(valorDeposito)) {
                        System.out.println("Depósito realizado com sucesso.");
                    } else {
                        System.out.println("Erro ao realizar depósito.");
                    }
                    break;

                case 3:
                    System.out.print("Número da conta: ");
                    int numSaque = scanner.nextInt();
                    System.out.print("Valor: ");
                    double valorSaque = scanner.nextDouble();

                    Conta contaSaque = banco.buscarConta(numSaque);
                    if (contaSaque != null && contaSaque.sacar(valorSaque)) {
                        System.out.println("Saque realizado com sucesso.");
                    } else {
                        System.out.println("Erro ao realizar saque.");
                    }
                    break;

                case 4:
                    System.out.print("Conta origem: ");
                    int origem = scanner.nextInt();
                    System.out.print("Conta destino: ");
                    int destino = scanner.nextInt();
                    System.out.print("Valor: ");
                    double valorTransferencia = scanner.nextDouble();

                    Conta contaOrigem = banco.buscarConta(origem);
                    Conta contaDestino = banco.buscarConta(destino);

                    if (contaOrigem != null && contaDestino != null &&
                            contaOrigem.transferir(contaDestino, valorTransferencia)) {
                        System.out.println("Transferência realizada com sucesso.");
                    } else {
                        System.out.println("Erro na transferência.");
                    }
                    break;

                case 5:
                    System.out.print("Número da conta: ");
                    int numSaldo = scanner.nextInt();
                    Conta contaSaldo = banco.buscarConta(numSaldo);

                    if (contaSaldo != null) {
                        System.out.println("Saldo: R$ " + contaSaldo.getSaldo());
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
