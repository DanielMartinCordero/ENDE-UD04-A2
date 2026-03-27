package figuras;

import java.util.Scanner;
import java.awt.Color;

/**
 * Clase de prueba que contiene el punto de entrada al programa.
 * Permite gestionar figuras mediante un menú interactivo por consola.
 *
 * @author DanielMartinCordero
 */
public class PruebaFigura {
    /** Constante para el mensaje de perímetro. */
    public static final String EL_PERIMETRO_ES = "El perimetro es ";
    /** Constante para el mensaje de área. */
    public static final String EL_AREA_ES = "El area es ";
    /** Constante para pedir dimensiones. */
    public static final String INTRODUZCA_EL_LADO = "Introduzca el lado";
    /** Color por defecto para todas las figuras creadas (Rojo). */
    public static final Color COLOR_DEFECTO = Color.red;
    /** Opción del menú para finalizar la ejecución. */
    public static final int OPCION_SALIR = 4;

    /**
     * Método principal que lanza la aplicación.
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        do {
            opcion = mostrarMenu();
            if (opcion != OPCION_SALIR) {
                System.out.print("Introduzca la coordenada x del centro: ");
                double x = teclado.nextDouble();
                System.out.print("Introduzca la coordenada y del centro: ");
                double y = teclado.nextDouble();
                switch (opcion) {
                    case 1 -> procesarTriangulo(teclado, x, y);
                    case 2 -> procesarRectangulo(teclado, x, y);
                    case 3 -> procesarCuadrado(teclado, x, y);
                }
            }
        } while (opcion != OPCION_SALIR);
        teclado.close();
    }

    /**
     * Solicita datos y genera un {@link Cuadrado}.
     * @param teclado Scanner activo para lectura.
     * @param x Coordenada X.
     * @param y Coordenada Y.
     */
    private static void procesarCuadrado(Scanner teclado, double x, double y) {
        System.out.print(INTRODUZCA_EL_LADO + " del cuadrado: ");
        double lado = teclado.nextDouble();
        Cuadrado c = new Cuadrado(x, y, COLOR_DEFECTO, lado);
        System.out.println(EL_PERIMETRO_ES + c.perimetro());
        System.out.println(EL_AREA_ES + c.area());
    }

    /**
     * Solicita datos y genera un {@link Rectangulo}.
     * @param teclado Scanner activo para lectura.
     * @param x Coordenada X.
     * @param y Coordenada Y.
     */
    private static void procesarRectangulo(Scanner teclado, double x, double y) {
        System.out.print("Introduzca la base del Rectangulo: ");
        double base = teclado.nextDouble();
        System.out.print("Introduzca la altura del Rectangulo: ");
        double altura = teclado.nextDouble();
        Rectangulo r = new Rectangulo(x, y, COLOR_DEFECTO, base, altura);
        System.out.println(EL_PERIMETRO_ES + r.perimetro());
        System.out.println(EL_AREA_ES + r.area());
    }

    /**
     * Solicita datos y genera un {@link Triangulo}.
     * @param teclado Scanner activo para lectura.
     * @param x Coordenada X.
     * @param y Coordenada Y.
     */
    private static void procesarTriangulo(Scanner teclado, double x, double y) {
        System.out.print(INTRODUZCA_EL_LADO + " 1 del Triangulo: ");
        double lado1 = teclado.nextDouble();
        System.out.print(INTRODUZCA_EL_LADO + " 2 del Triangulo: ");
        double lado2 = teclado.nextDouble();
        System.out.print(INTRODUZCA_EL_LADO + " 3 del Triangulo: ");
        double lado3 = teclado.nextDouble();
        Triangulo t = new Triangulo(x, y, COLOR_DEFECTO, lado1, lado2, lado3);
        System.out.println(EL_PERIMETRO_ES + t.perimetro());
        System.out.println(EL_AREA_ES + t.area());
    }

    /**
     * Muestra el menú de opciones y valida la entrada del usuario.
     * @return La opción seleccionada (1-4).
     */
    public static int mostrarMenu() {
        int opcion;
        System.out.println("1) Triangulo\n2) Rectangulo\n3) Cuadrado\n4) Salir");
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Introduzca una opcion (1-4): ");
            opcion = teclado.nextInt();
            if (opcion < 1 || opcion > OPCION_SALIR)
                System.out.println("Debe introducir un número entre 1 y 4");
        } while (opcion < 1 || opcion > OPCION_SALIR);
        return opcion;
    }
}