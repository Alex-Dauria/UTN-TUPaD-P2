// Ejercicio 1: Verificación de Año Bisiesto

import java.util.Scanner;

public class VerificacionAnoBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int ano = scanner.nextInt();
        boolean esBisiesto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        if (esBisiesto) {
            System.out.println("El año " + ano + " es bisiesto.");
        } else {
            System.out.println("El año " + ano + " no es bisiesto.");
        }
        scanner.close();
    }
}
