package figuras;

/**
 * Representa un punto en un sistema de coordenadas (x, y).
 *
 * @author DanielMartinCordero
 * @version 1.0
 */
public class Punto {
    private double x;
    private double y;

    /** Constructor por defecto que inicializa el punto en el origen (0,0). */
    public Punto() { x = 0; y = 0; }

    /**
     * Constructor con parámetros.
     * @param x Coordenada horizontal.
     * @param y Coordenada vertical.
     */
    public Punto(double x, double y) { this.x = x; this.y = y; }

    /**
     * Constructor de copia.
     * @param p Instancia de {@link Punto} de la que se copiarán las coordenadas.
     */
    public Punto(Punto p) { x = p.x; y = p.y; }

    /** @return Coordenada X. */
    public double getX() { return x; }
    /** @return Coordenada Y. */
    public double getY() { return y; }
    /** @param x Nueva coordenada X. */
    public void setX(double x) { this.x = x; }
    /** @param y Nueva coordenada Y. */
    public void setY(double y) { this.y = y; }

    /**
     * Calcula la distancia euclídea entre este punto y otro.
     * @param p Punto de destino.
     * @return Distancia entre ambos puntos.
     */
    public double distancia(Punto p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }

    /**
     * Genera un nuevo punto simétrico respecto al eje Y.
     * @return Nuevo objeto {@link Punto} con la coordenada X invertida.
     */
    public Punto simetrico() { return new Punto(this.x * -1, this.y); }

    /**
     * Compara si dos puntos tienen las mismas coordenadas.
     * @param p Punto a comparar.
     * @return true si las coordenadas coinciden, false en caso contrario.
     */
    public boolean compara(Punto p) { return p.x == x && p.y == y; }

    @Override
    public String toString() { return "(" + x + "," + y + ")"; }
}