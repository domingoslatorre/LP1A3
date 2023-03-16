package aula3.exemplos;

public class Quadrado {
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
            throw new IllegalArgumentException("Lado deve ser maior que zero");
        }

        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    
}
