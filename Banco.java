import java.util.ArrayList;

public class Banco {

    private ArrayList<Conta> contas;
    private int proximoNumeroConta;

    public Banco() {
        contas = new ArrayList<>();
        proximoNumeroConta = 1;
    }

    public Conta criarConta(String titular) {
        Conta novaConta = new Conta(proximoNumeroConta, titular);
        contas.add(novaConta);
        proximoNumeroConta++;
        return novaConta;
    }

    public Conta buscarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}
