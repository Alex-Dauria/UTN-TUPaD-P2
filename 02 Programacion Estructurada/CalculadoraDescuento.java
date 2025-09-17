// Ejercicio 4: Calculadora de Descuento según categoría

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = scanner.next().toUpperCase();
        double descuento = 0;
        int porcentaje = 0;
        switch (categoria) {
            case "A":
                descuento = 0.10;
                porcentaje = 10;
                break;
            case "B":
                descuento = 0.15;
                porcentaje = 15;
                break;
            case "C":
                descuento = 0.20;
                porcentaje = 20;
                break;
        }
        double descuentoAplicado = precio * descuento;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("Descuento aplicado: " + porcentaje + "%");
        System.out.println("Precio final: " + precioFinal);
        scanner.close();
    }
}
