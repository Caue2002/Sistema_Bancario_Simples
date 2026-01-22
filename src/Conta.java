public class Conta {

    private int numeroConta;
    private String titular;
    private double saldo;

    // Construtor
    public Conta(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Depositar dinheiro
    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    // Sacar dinheiro
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    // Transferência para outra conta
    public boolean transferir(Conta destino, double valor) {

        if (destino == null || valor <= 0) {
            return false;
        }

        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        }

        return false;
    }

    // Getters
    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
