package figuras;

import java.awt.Color;

/**
 * Representa un rectángulo definido por su base y su altura.
 * Hereda de la clase {@link Figura}.
 *
 * @author DanielMartinCordero
 * @version 1.0
 */
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    /**
     * Crea un rectángulo con las dimensiones y atributos de posición especificados.
     * @param x Coordenada X del centro.
     * @param y Coordenada Y del centro.
     * @param color Color de la figura.
     * @param base Longitud de la base.
     * @param altura Longitud de la altura.
     */
    public Rectangulo(double x, double y, Color color, double base, double altura) {
        super(x, y, color);
        this.base = base;
        this.altura = altura;
    }

    /** * Obtiene la longitud de la base.
     * @return La base del rectángulo.
     */
    public double getBase() { return base; }

    /** * Obtiene la longitud de la altura.
     * @return La altura del rectángulo.
     */
    public double getAltura() { return altura; }

    /** * Establece una nueva longitud para la base.
     * @param base Nueva longitud de la base.
     */
    public void setBase(double base) { this.base = base; }

    /** * Establece una nueva longitud para la altura.
     * @param altura Nueva longitud de la altura.
     */
    public void setAltura(double altura) { this.altura = altura; }

    /**
     * Calcula el perímetro sumando sus cuatro lados.
     * @return Valor numérico del perímetro.
     */
    @Override
    public double perimetro() { return 2 * base + 2 * altura; }

    /**
     * Calcula el área multiplicando base por altura.
     * @return Valor numérico del área.
     */
    @Override
    public double area() { return base * altura; }
}