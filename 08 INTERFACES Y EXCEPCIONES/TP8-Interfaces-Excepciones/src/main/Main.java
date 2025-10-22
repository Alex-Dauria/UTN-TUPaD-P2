
package main;

import modelos.*;
import excepciones.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA E-COMMERCE ===");
        
        // Parte 1: Sistema de E-commerce con Interfaces
        Cliente cliente = new Cliente("Juan Perez", "juan@email.com");
        
        Producto producto1 = new Producto("Laptop", 1500.00);
        Producto producto2 = new Producto("Mouse", 25.50);
        Producto producto3 = new Producto("Teclado", 75.00);
        
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);
        pedido.agregarProducto(producto3);
        
        System.out.println("\n--- Información del Pedido ---");
        System.out.println("Total del pedido: $" + pedido.calcularTotal());
        
        // Cambiar estado (debe notificar al cliente)
        pedido.cambiarEstado("PROCESANDO");
        pedido.cambiarEstado("ENVIADO");
        
        // Procesar pagos con diferentes métodos
        System.out.println("\n--- Procesamiento de Pagos ---");
        TarjetaCredito tarjeta = new TarjetaCredito("1234567812345678", "Juan Perez");
        double totalConDescuento = tarjeta.aplicarDescuento(pedido.calcularTotal());
        tarjeta.procesarPago(totalConDescuento); // Paga el monto con descuento
        
        PayPal paypal = new PayPal("juan@email.com");
        paypal.procesarPago(pedido.calcularTotal());
        
        System.out.println("\n=== EJERCICIOS DE EXCEPCIONES ===");
        
        // Parte 2: Ejercicios de Excepciones
        EjerciciosExcepciones.divisionSegura();
        EjerciciosExcepciones.conversionCadenaNumero();
        EjerciciosExcepciones.lecturaArchivo();
        EjerciciosExcepciones.leerConTryWithResources();
        
        // Validación de edad con excepción personalizada
        System.out.println("\n--- Validacion de Edad ---");
        try {
            EjerciciosExcepciones.validarEdad(25);
            EjerciciosExcepciones.validarEdad(150); // Esto lanzará excepción
        } catch (EdadInvalidaException e) {
            System.out.println("Excepcion capturada: " + e.getMessage());
        }
    }
}
