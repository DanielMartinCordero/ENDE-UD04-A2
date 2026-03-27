package figuras;

import java.awt.Color;

/**
 * Representa un cuadrado dentro del sistema.
 * Esta clase es una especialización de {@link Rectangulo} donde se garantiza
 * que tanto la base como la altura tengan la misma dimensión (lado).
 *
 * @author DanielMartinCordero
 * @version 1.0
 */
public class Cuadrado extends Rectangulo {

    /**
     * Construye un nuevo objeto Cuadrado con una posición, color y dimensión especificados.
     * El constructor invoca al de la superclase {@link Rectangulo} pasando el parámetro
     * del lado para ambos ejes de dimensión.
     *
     * @param x Coordenada horizontal del centro de la figura.
     * @param y Coordenada vertical del centro de la figura.
     * @param color Instancia de {@link Color} que define el color de relleno del cuadrado.
     * @param lado Valor numérico que define la longitud de los cuatro lados de la figura.
     */
    public Cuadrado(double x, double y, Color color, double lado) {
        super(x, y, color, lado, lado);
    }
}