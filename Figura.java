package figuras;

import java.awt.Color;

/**
 * Clase abstracta que define la estructura base de cualquier figura.
 * Proporciona la gestión de la posición central y el color, además de definir
 * los métodos abstractos para cálculos geométricos.
 *
 * @author DanielMartinCordero
 * @version 1.0
 */
public abstract class Figura {
    /** Punto que representa el centro de la figura. */
    private Punto centro;
    /** Color de representación de la figura. */
    private Color color;

    /**
     * Crea una nueva figura con una ubicación y color determinados.
     *
     * @param x Coordenada horizontal del centro.
     * @param y Coordenada vertical del centro.
     * @param color Instancia de {@link Color} para la figura.
     */
    public Figura(double x, double y, Color color) {
        centro = new Punto(x, y);
        this.color = color;
    }

    /** @return La coordenada X del centro de la figura. */
    public double getXCentro() { return centro.getX(); }

    /** @return La coordenada Y del centro de la figura. */
    public double getYCentro() { return centro.getY(); }

    /** @return El color actual de la figura. */
    public Color getColor() { return color; }

    /** @param x Nueva coordenada X para el centro. */
    public void setXCentro(double x) { centro.setX(x); }

    /** @param y Nueva coordenada Y para el centro. */
    public void setYCentro(double y) { centro.setY(y); }

    /** @param color Nuevo color para la figura. */
    public void setColor(Color color) { this.color = color; }

    /**
     * Calcula el perímetro de la figura.
     * @return Valor numérico del perímetro.
     */
    public abstract double perimetro();

    /**
     * Calcula el área de la figura.
     * @return Valor numérico del área.
     */
    public abstract double area();

    /**
     * Compara el área de esta figura con otra dada.
     *
     * @param otraFigura La figura con la que se desea comparar.
     * @return Un entero: 1 si esta es mayor, -1 si es menor, 0 si son iguales.
     */
    public int esMayorQue(Figura otraFigura) {
        if (this.area() > otraFigura.area()) return 1;
        else if (this.area() < otraFigura.area()) return -1;
        else return 0;
    }
}