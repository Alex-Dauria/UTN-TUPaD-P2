// Ejercicio 8, división con double:

import java.util.Scanner;

public class DivisionDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();

        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("Division (double): " + division);
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }

        scanner.close();
    }
}
