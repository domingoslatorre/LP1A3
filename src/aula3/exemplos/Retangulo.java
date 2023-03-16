package aula3.exemplos;

public class Retangulo {
    private final double base;
    private final double altura;

    public Retangulo(double base, double altura) {
        if (base <= 0.0) {
            throw new IllegalArgumentException("Base deve ser maior que zero");
        }

        if (altura <= 0.0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero");
        }

        this.base = base;
        this.altura = altura;
    }

    // modificador de acesso + tipo retorno + nome + parametros
    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}
