// Ejercicio 3: Clasificación de Edad

import java.util.Scanner;

public class ClasificacionEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        String clasificacion;
        if (edad < 12) {
            clasificacion = "Niño";
        } else if (edad <= 17) {
            clasificacion = "Adolescente";
        } else if (edad <= 59) {
            clasificacion = "Adulto";
        } else {
            clasificacion = "Adulto mayor";
        }
        System.out.println("Eres un " + clasificacion + ".");
        scanner.close();
    }
}