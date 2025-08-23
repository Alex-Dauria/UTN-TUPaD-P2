// Ejercicio 10: Actualización de stock a partir de venta y recepción de productos

import java.util.Scanner;

public class ActualizacionStock {
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el stock actual del producto: ");
        int stock = scanner.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int vendida = scanner.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int recibida = scanner.nextInt();
        int nuevo = actualizarStock(stock, vendida, recibida);
        System.out.println("El nuevo stock del producto es: " + nuevo);
        scanner.close();
    }
}
