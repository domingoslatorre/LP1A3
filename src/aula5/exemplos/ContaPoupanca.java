package aula5.exemplos;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero) {
        super(numero);
    }

    @Override
    public void sacar(double valor) {
        if (isBloqueada()) {
            throw new IllegalStateException("conta bloqueada");
        }

        if (valor <= 0.0) {
            throw new IllegalArgumentException("valor deve ser maior que zero");
        }

        if (valor > saldo) {
            throw new RuntimeException("saldo insuficiente");
        }


        this.saldo -= valor;
    }



    @Override
    public void transferir(double valor, Conta conta) {
        if (isBloqueada()) {
            throw new IllegalStateException("conta bloqueada");
        }

        if (conta.isBloqueada()) {
            throw new IllegalStateException("conta bloqueada");
        }

        if (valor <= 0.0) {
            throw new IllegalArgumentException("valor deve ser maior que zero");
        }

        if (valor > saldo) {
            throw new RuntimeException("saldo insuficiente");
        }

        this.saldo -= valor;
        conta.saldo += valor;
    }
    
}
