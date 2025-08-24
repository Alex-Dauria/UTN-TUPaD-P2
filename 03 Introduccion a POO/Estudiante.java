// Ejercicio 1: Registro de Estudiantes - Alex Dauria

public class Estudiante {
    private String nombre;       // Nombre del estudiante
    private String apellido;     // Apellido del estudiante
    private String curso;        // Curso al que pertenece
    private double calificacion; // Calificación actual

    // Constructor: inicializa todos los atributos del estudiante
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    // Muestra información completa del estudiante
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }

    // Aumenta la calificación
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("Calificación aumentada en " + puntos + " puntos.");
    }

    // Disminuye la calificación
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        System.out.println("Calificación disminuida en " + puntos + " puntos.");
    }

    // Main: prueba de la clase
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Alex", "Dauria", "Programación II", 7.5);
        estudiante.mostrarInfo();        // Mostrar datos iniciales
        estudiante.subirCalificacion(1.5); // Aumentar calificación
        estudiante.bajarCalificacion(0.5); // Disminuir calificación
        estudiante.mostrarInfo();        // Mostrar datos finales
    }
}
