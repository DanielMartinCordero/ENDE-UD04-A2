package figuras;

import java.awt.Color;

/**
 * Representa un rectángulo definido por su base y su altura.
 * Hereda de la clase {@link Figura}.
 *
 * @author Dani
 */
public class Rectángulo extends Figura {
    private double base;
    private double altura;

    /**
     * Crea un rectángulo con las dimensiones y atributos especificados.
     * @param x Coordenada X del centro.
     * @param y Coordenada Y del centro.
     * @param color Color de la figura.
     * @param base Longitud de la base.
     * @param altura Longitud de la altura.
     */
    public Rectángulo(double x, double y, Color color, double base, double altura) {
        super(x, y, color);
        this.base = base;
        this.altura = altura;
    }

    /** @return La base del rectángulo. */
    public double getBase() { return base; }
    /** @return La altura del rectángulo. */
    public double getAltura() { return altura; }
    /** @param base Nueva longitud de la base. */
    public void setBase(double base) { this.base = base; }
    /** @param altura Nueva longitud de la altura. */
    public void setAltura(double altura) { this.altura = altura; }

    @Override
    public double perimetro() { return 2 * base + 2 * altura; }

    @Override
    public double area() { return base * altura; }
}