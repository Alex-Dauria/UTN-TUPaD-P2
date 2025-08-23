// Ejercicio 13: Impresión recursiva de arrays antes y después de modificar un elemento

public class ImpresionRecursivaArray {
    public static void imprimirPrecios(double[] precios, int index) {
        if (index >= precios.length) return;
        System.out.println("Precio: $" + precios[index]);
        imprimirPrecios(precios, index + 1);
    }

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        imprimirPrecios(precios, 0);
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        imprimirPrecios(precios, 0);
    }
}
