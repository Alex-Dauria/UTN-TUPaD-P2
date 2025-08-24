// Ejercicio 2: Registro de Mascotas - Alex Dauria

public class Mascota {
    private String nombre;   // Nombre de la mascota
    private String especie;  // Especie (perro, gato, etc.)
    private int edad;        // Edad actual de la mascota

    // Constructor: inicializa todos los atributos
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Muestra información completa de la mascota
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    // Simula que la mascota cumple un año más
    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ha cumplido un año más.");
    }

    // Main: prueba de la clase
    public static void main(String[] args) {
        Mascota mascota = new Mascota("Firulais", "Perro", 3);
        mascota.mostrarInfo();   // Mostrar datos iniciales
        mascota.cumplirAnios();  // Cumple un año
        mascota.cumplirAnios();  // Cumple otro año
        mascota.mostrarInfo();   // Mostrar datos finales
    }
}
