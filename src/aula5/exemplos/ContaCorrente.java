package aula5.exemplos;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, double limite) {
        super(numero);
        this.limite = limite;  
    }

    // 500 , 1000  1200
    @Override
    public void sacar(double valor) {
        if (isBloqueada()) {
            throw new IllegalStateException("conta bloqueada");
        }

        if (valor <= 0.0) {
            throw new IllegalArgumentException("valor deve ser maior que zero");
        }

        if (valor > valorDisponivel()) {
            throw new RuntimeException("saldo insuficiente");
        }


        this.saldo -= valor;
    }

    private double valorDisponivel() {
        return getSaldo() + limite;
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

        if (valor > valorDisponivel()) {
            throw new RuntimeException("saldo insuficiente");
        }

        this.saldo -= valor;
        conta.saldo += valor;
    }
    
}
