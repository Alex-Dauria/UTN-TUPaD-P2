// Ejercicio 5: Suma de Números Pares (while)

import java.util.Scanner;

public class SumaNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        System.out.print("Ingrese un número (0 para terminar): ");
        int num = scanner.nextInt();
        while (num != 0) {
            if (num % 2 == 0) {
                suma += num;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            num = scanner.nextInt();
        }
        System.out.println("La suma de los números pares es: " + suma);
        scanner.close();
    }
}
