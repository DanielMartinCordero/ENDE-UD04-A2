//Paquete común a todas las figuras
package figuras;

import java.awt.*;

public class Cuadrado extends Rectángulo {
    public Cuadrado(double x, double y, Color color, double lado) {
        //Llama al constructor de rectángulo, su clase padre
        super(x, y, color, lado, lado);
    }
}