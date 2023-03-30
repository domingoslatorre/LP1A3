package aula5.exemplos;

// Conta - Super
// ContaCorrente, ContaPoupanca - Subs
public abstract class Conta {
    private int numero;
    protected double saldo;
    private boolean bloqueada;

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0.0;
        this.bloqueada = false;
    }

    public void depositar(double valor) {
        if (bloqueada) {
            throw new IllegalStateException("conta bloqueada");
        }

        if (valor <= 0.0) {
            throw new IllegalArgumentException("valor deve ser maior que zero");
        }


        this.saldo += valor;
    }


    public abstract void sacar(double valor);

    public abstract void transferir(double valor, Conta conta);

    public double getSaldo() {
        return saldo;
    }

    public boolean isBloqueada() {
        return bloqueada;
    }
}
