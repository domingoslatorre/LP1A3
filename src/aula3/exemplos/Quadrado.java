package aula3.exemplos;

public class Quadrado {
    public static final String MENSAGEM_LADO_INVALIDO = "Lado deve ser maior que zero";
    private double lado;

    public Quadrado(double lado) {
        setLado(lado);
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public void setLado(double lado) {
        if (lado <= 0.0) {
            throw new IllegalArgumentException(MENSAGEM_LADO_INVALIDO);
        }

        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    
}
