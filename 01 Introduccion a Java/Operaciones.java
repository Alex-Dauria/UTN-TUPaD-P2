// Ejercicio 5:

import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (num2 != 0) ? (double) num1 / num2 : Double.NaN;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        if (num2 != 0) {
            System.out.println("Division: " + division);
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }

        scanner.close();
    }
}
