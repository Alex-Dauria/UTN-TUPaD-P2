package Ej12;

public class MainEj12 {
    public static void main(String[] args) {
        Contribuyente c = new Contribuyente("Empresa S.A.", "20-12345678-9");
        Impuesto i = new Impuesto(5000.0, c);
        Calculadora calc = new Calculadora();
        calc.calcular(i);
    }
}