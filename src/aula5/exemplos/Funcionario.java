package aula5.exemplos;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private double salario;
    private LocalDate contratadoEm;

    public Funcionario(String nome, double salario, LocalDate contratadoEm) {
        this.nome = nome;
        this.salario = salario;
        this.contratadoEm = contratadoEm;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public LocalDate getContratadoEm() {
        return contratadoEm;
    }
}
