// Ejercicio 8: Cálculo del Precio Final con impuesto y descuento

import java.util.Scanner;

public class CalculoPrecioFinal {
    static double precioBase;

    public static double calcularPrecioFinal(double impuesto, double descuento) {
        return precioBase + (precioBase * (impuesto / 100)) - (precioBase * (descuento / 100));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = scanner.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double imp = scanner.nextDouble();
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double desc = scanner.nextDouble();
        double finalPrice = calcularPrecioFinal(imp, desc);
        System.out.println("El precio final del producto es: " + finalPrice);
        scanner.close();
    }
}
