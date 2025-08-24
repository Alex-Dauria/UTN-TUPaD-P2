// Ejercicio 5: Simulación de Nave Espacial - Alex Dauria

public class NaveEspacial {
    private String nombre;            // Nombre de la nave
    private int combustible;          // Combustible actual
    private final int LIMITE_COMBUSTIBLE = 100; // Límite máximo de combustible

    // Constructor: inicializa nombre y combustible (sin exceder el límite)
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = Math.min(combustible, LIMITE_COMBUSTIBLE);
    }

    // Método para despegar: consume 10 unidades de combustible
    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    // Método para avanzar cierta distancia
    // Consumo estimado: 1 unidad de combustible cada 10 unidades de distancia
    public void avanzar(int distancia) {
        int combustibleNecesario = distancia / 10;
        if (combustible >= combustibleNecesario) {
            combustible -= combustibleNecesario;
            System.out.println(nombre + " ha avanzado " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " unidades.");
        }
    }

    // Método para recargar combustible sin superar el límite
    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= LIMITE_COMBUSTIBLE) {
            combustible += cantidad;
            System.out.println("Recargado " + cantidad + " unidades de combustible. Total: " + combustible);
        } else {
            int recargaMax = LIMITE_COMBUSTIBLE - combustible;
            combustible = LIMITE_COMBUSTIBLE;
            System.out.println("Recargado solo " + recargaMax + " unidades. Límite alcanzado. Total: " + combustible);
        }
    }

    // Muestra el estado actual de la nave
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + combustible);
    }

    // Main: prueba de la clase
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial("Enterprise", 50);
        
        // Intentar avanzar 600 unidades sin recargar (falla porque necesita 60)
        nave.avanzar(600);
        
        // Recargar combustible
        nave.recargarCombustible(60);
        
        // Avanzar correctamente después de recargar
        nave.avanzar(600);
        
        // Mostrar estado final de la nave
        nave.mostrarEstado();
    }
}
