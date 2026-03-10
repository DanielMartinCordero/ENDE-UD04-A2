package figuras;

import java.awt.Color;

public abstract class Figura {
    private final Punto centro;
    private Color color;

    public Figura(double x, double y, Color color) {
        centro = new Punto(x, y);
        this.color = color;
    }

    public double getXCentro() {
        return centro.getX();
    }

    public void setXCentro(double x) {
        centro.setX(x);
    }

    public double getYCentro() {
        return centro.getY();
    }

    public void setYCentro(double y) {
        centro.setY(y);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double perímetro();

    public abstract double área();

    public int esMayorQue(Figura otraFigura) {
        int codigo;
        double área = otraFigura.área();
        if (this.área() > área) codigo = 1;
        else if (this.área() < área) codigo = -1;
        else codigo = 0;
        return codigo;
    }
}