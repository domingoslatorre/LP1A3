package aula5.exemplos;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var funcionario = new Funcionario("João", 3500.00, LocalDate.of(2022, 3, 29));
        var gerente = new Gerente("Maria", 5000.00, LocalDate.now(), 1000.00);
    
        System.out.println(funcionario.getNome());
        System.out.println(gerente.getNome());

        System.out.println(funcionario.getSalario());
        System.out.println(gerente.getSalario());


        ContaCorrente c = new ContaCorrente(1, 0);
    }
}
