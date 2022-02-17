package entej6practico;

import java.util.Scanner;

/**
 *
 * @author davsan03
 */
public class EntEj6Practico {

    /**
     * Método que convierte fahrenheit a celsius
     *
     * @param celsius Double que guarda los celsius introduzidos
     * @return Devuelve el resultado de la operación
     */
    public static double fahrenheitcelsius(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    /**
     * Método que convierte celsius a fahrenheit
     *
     * @param fahrenheit Double que guarda los celsius introduzidos
     * @return Devuelve el resultado de la operación
     */
    public static double celsiusfahrenheit(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * Método main que llama a los métodos de conversión y muestra el resultado
     * @param args Parámetros de entrada de línea de comandos
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.println("Que deseas hacer, Celsius a Fahrenheit(1) o Fahrenheit a Celsius(2)");
        int eleccion = sc.nextInt();
        if (eleccion == 1) {
            System.out.println("Ingrese el número de Celsius que se pasarán a Fahrenheit");
            celsius = sc.nextInt();
            System.out.println(celsius + " grados celsius son " + fahrenheitcelsius(celsius) + " grados Fahrenheit");
        } else if (eleccion == 2) {
            System.out.println("Ingrese el número de Fahrenheit que se pasarán a Celsius");
            fahrenheit = sc.nextInt();
            System.out.println(fahrenheit + " grados Fahrenheit son " + celsiusfahrenheit(fahrenheit) + " grados  celsius");
        } else {
            System.out.println("Error, recuerda que solo tienes dos opciones (1, 2)");
        }

    }

}
