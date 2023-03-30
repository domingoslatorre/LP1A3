package aula5.exemplos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContaTest {

    @Test
    public void criaUmaContaComSaldoZero() {
        Conta conta = new Conta(1);

        assertEquals(0.0, conta.getSaldo());
    }

    @Test
    public void criaUmaContaAtiva() {
        Conta conta = new Conta(1);

        assertEquals(false, conta.isBloqueada());
    }

    @Test
    public void deposita100NaConta() {
        Conta conta = new Conta(1);

        conta.depositar(100.00);

        assertEquals(100.00, conta.getSaldo());
    }

    @Test
    public void transfere50reais() {
        // AAA
        // Arrange
        Conta conta1 = new Conta(1);
        Conta conta2 = new Conta(2);
        conta1.depositar(200.00);
        
        // Act
        conta1.transferir(50.00, conta2);

        // Assert
        assertEquals(150.00, conta1.getSaldo());
        assertEquals(50.00, conta2.getSaldo());
    }
}
