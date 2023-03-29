package aula5.exemplos;

import java.time.LocalDate;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, LocalDate contratadoEm, double bonus) {
        super(nome, salario, contratadoEm);
        this.bonus = bonus;
    }

    // Sobrescrita
    @Override
    public double getSalario() {
        return super.getSalario() + bonus;
    }
}
