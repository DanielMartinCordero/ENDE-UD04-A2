package figuras;

import java.awt.Color;

/**
 * Representa un triángulo definido por la longitud de sus tres lados.
 * Hereda de la clase {@link Figura}.
 *
 * @author Dani
 */
public class Triángulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;

    /**
     * Construye un triángulo basado en sus tres lados y posición.
     * @param x Coordenada X del centro.
     * @param y Coordenada Y del centro.
     * @param color Color de la figura.
     * @param lado1 Longitud del primer lado.
     * @param lado2 Longitud del segundo lado.
     * @param lado3 Longitud del tercer lado.
     */
    public Triángulo(double x, double y, Color color, double lado1, double lado2, double lado3) {
        super(x, y, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /** @return Longitud del lado 1. */
    public double getLado1() { return lado1; }
    /** @return Longitud del lado 2. */
    public double getLado2() { return lado2; }
    /** @return Longitud del lado 3. */
    public double getLado3() { return lado3; }

    @Override
    public double perimetro() { return lado1 + lado2 + lado3; }

    /**
     * Calcula el área utilizando la fórmula de Herón.
     * @return El área calculada del triángulo.
     */
    @Override
    public double area() {
        double sp = perimetro() / 2;
        return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3));
    }
}