package aula4.exemplos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import aula3.exemplos.Quadrado;

public class QuadradoTest {
    
    @Test
    public void criaUmQuadradoComLado10() {
        // AAA
        // Arrange
        double lado = 10.0;

        // Act
        Quadrado quadrado = new Quadrado(lado);

        // Assert
        assertEquals(lado, quadrado.getLado());

    }

    @Test
    public void oQuadradoComLado10DeveTerArea100() {
        // Arrange
        double areaEsperada = 100.00;
        Quadrado quadrado = new Quadrado(10.0);

        // Act
        double area = quadrado.calcularArea();

        // Assert
        assertEquals(areaEsperada, area);
    }

    @Test
    public void oQuadradoComLado10DeveTerAreaPerimetro40() {
        double perimetroEsperado = 40.00;
        Quadrado quadrado = new Quadrado(10.0);

        double perimetro = quadrado.calcularPerimetro();

        assertEquals(perimetroEsperado, perimetro);
    }

    @Test
    public void deveAlterarOValorDoLado() {
        Quadrado quadrado = new Quadrado(10.0);

        quadrado.setLado(5.0);

        assertEquals(5.0, quadrado.getLado());
    }

    // Valores esperados (Expected values)
    

    // Valores limites (Boundary values)
    @Test
    public void deveLancarUmaExceptionQuandoOValorDeLadoForZero() {
        assertThrowsExactly(IllegalArgumentException.class, () -> { new Quadrado(0); });
    }

    @Test
    public void deveLancarUmaExceptionQuandoOValorDeLadoForZeroComAMsgCorreta() {
        IllegalArgumentException exception = assertThrowsExactly(
            IllegalArgumentException.class, () -> { new Quadrado(0); });

        assertEquals("Lado deve ser maior que zero", exception.getMessage());
    }

    // Valores estranhos (Strange values)

    @Test
    public void deveLancarUmaExceptionQuandoOValorDeLadoForNegativo() {
        assertThrowsExactly(IllegalArgumentException.class, () -> { new Quadrado(-10); });
    }

    @Test
    public void deveLancarUmaExceptionQuandoOValorDeLadoForNegativoComAMsgCorreta() {
        IllegalArgumentException exception = assertThrowsExactly(
            IllegalArgumentException.class, () -> { new Quadrado(-10); });

        assertEquals("Lado deve ser maior que zero", exception.getMessage());
    }


    @ParameterizedTest
    @ValueSource(doubles = { 1.0, 3.0, 5.5, 100.0 })
    public void testaVariosValoresParaoLado(double lado) {
        Quadrado quadrado = new Quadrado(lado);

        assertEquals(lado, quadrado.getLado());
    }
}
