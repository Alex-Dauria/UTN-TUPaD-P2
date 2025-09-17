package Ej12;

// Clase Calculadora
public class Calculadora {
    // Dependencia de uso: usa Impuesto como parámetro, no lo almacena
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto de monto: " + impuesto.getMonto());
    }
}