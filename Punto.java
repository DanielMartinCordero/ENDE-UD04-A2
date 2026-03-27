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

    /** Crea un nuevo punto inicializado en el origen de coordenadas. */
    public Punto() { x = 0; y = 0; }

    /**
     * Crea un nuevo punto con coordenadas específicas.
     * @param x Coordenada horizontal.
     * @param y Coordenada vertical.
     */
    public Punto(double x, double y) { this.x = x; this.y = y; }

    /**
     * Crea un nuevo punto a partir de otro punto existente (constructor de copia).
     * @param p Instancia de {@link Punto} de la que se copiarán las coordenadas.
     */
    public Punto(Punto p) { x = p.x; y = p.y; }

    /** * Obtiene el valor de la coordenada X.
     * @return Coordenada X.
     */
    public double getX() { return x; }

    /** * Obtiene el valor de la coordenada Y.
     * @return Coordenada Y.
     */
    public double getY() { return y; }

    /** * Establece un nuevo valor para la coordenada X.
     * @param x Nueva coordenada X.
     */
    public void setX(double x) { this.x = x; }

    /** * Establece un nuevo valor para la coordenada Y.
     * @param y Nueva coordenada Y.
     */
    public void setY(double y) { this.y = y; }

    /**
     * Calcula la distancia lineal entre este punto y otro punto dado.
     * @param p Punto de destino.
     * @return Distancia euclídea entre ambos puntos.
     */
    public double distancia(Punto p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }

    /**
     * Calcula el punto simétrico respecto al eje Y.
     * @return Nuevo objeto {@link Punto} con la coordenada X invertida.
     */
    public Punto simetrico() { return new Punto(this.x * -1, this.y); }

    /**
     * Determina si dos puntos son iguales comparando sus coordenadas.
     * @param p Punto a comparar.
     * @return true si las coordenadas coinciden exactamente, false en caso contrario.
     */
    public boolean compara(Punto p) { return p.x == x && p.y == y; }

    /**
     * Genera una representación textual del punto.
     * @return Cadena de texto con formato (x,y).
     */
    @Override
    public String toString() { return "(" + x + "," + y + ")"; }
}