package aula4.exemplos;

import aula3.exemplos.Quadrado;
import aula3.exemplos.Retangulo;

public class Canvas {
    private Quadrado[] quadrados;
    private Retangulo[] retangulos;
    private int quantidadeQuadrados;
    private int quantidadeRetangulos;

    public Canvas(int capacidadeQuadrados, int capacidadeRetangulos) {
        if(capacidadeQuadrados <= 0) {
            throw new IllegalArgumentException("capacidade quadrados deve ser maior que zero");
        }

        if(capacidadeRetangulos <= 0) {
            throw new IllegalArgumentException("capacidade retangulos deve ser maior que zero");
        }

        quadrados = new Quadrado[capacidadeQuadrados];
        retangulos = new Retangulo[capacidadeRetangulos];
        quantidadeQuadrados = 0;
        quantidadeRetangulos = 0;
    }

    public void adicionarQuadrado(Quadrado quadrado) {
        if(quantidadeQuadrados == quadrados.length) {
            throw new RuntimeException("array de quadrados está cheio");
        }

        quadrados[quantidadeQuadrados] = quadrado;
        quantidadeQuadrados++;
    }

    public void adicionarRetangulo(Retangulo retangulo) {
        if(quantidadeRetangulos == retangulos.length) {
            throw new RuntimeException("array de retangulo está cheio");
        }

        retangulos[quantidadeRetangulos] = retangulo;
        quantidadeRetangulos++;
    }


    public int getQuantidadeQuadrados() {
        return quantidadeQuadrados;
    }

    public int getQuantidadeRetangulos() {
        return quantidadeRetangulos;
    }

    public double getSomaAreaQuadrados() {
        double soma = 0.0;

        for (int i = 0; i < quantidadeQuadrados; i++) {
            soma = soma + quadrados[i].calcularArea();
        }

        return soma;
    }

    public double getSomaAreaRetangulos() {
        double soma = 0.0;

        for (int i = 0; i < quantidadeRetangulos; i++) {
            soma += retangulos[i].calcularArea();
        }

        return soma;
    }

    public double getSomaPerimetroQuadrados() {
        double soma = 0.0;

        for (int i = 0; i < quantidadeQuadrados; i++) {
            soma = soma + quadrados[i].calcularPerimetro();
        }

        return soma;
    }

    public double getSomaPerimetroRetangulos() {
        double soma = 0.0;

        for (int i = 0; i < quantidadeRetangulos; i++) {
            soma += retangulos[i].calcularPerimetro();
        }

        return soma;
    }
}
