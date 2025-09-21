package Ej12;

public class MainEj12 {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Carlos Peralta", "20-12345678-3");
        Impuesto impuesto = new Impuesto(50000.0, contribuyente);
        Calculadora calc = new Calculadora();
        calc.calcular(impuesto); // dependencia de uso
    }
}