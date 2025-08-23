// Ejercicio 8, división con int:

import java.util.Scanner;

public class DivisionEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo numero entero: ");
        int num2 = scanner.nextInt();

        if (num2 != 0) {
            int division = num1 / num2;
            System.out.println("Division (entera): " + division);
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }

        scanner.close();
    }
}
