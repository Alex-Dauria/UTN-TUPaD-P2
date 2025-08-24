// Ejercicio 3: Encapsulamiento con la Clase Libro - Alex Dauria

public class Libro {
    private String titulo;          // Título del libro
    private String autor;           // Autor del libro
    private int añoPublicacion;     // Año de publicación

    // Constructor: inicializa los atributos. Año se valida con el setter
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion);
    }

    // Getters para acceder a los atributos privados
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAñoPublicacion() { return añoPublicacion; }

    // Setter con validación para año de publicación
    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 0 && añoPublicacion <= java.time.Year.now().getValue()) {
            this.añoPublicacion = añoPublicacion;
            System.out.println("Año de publicación actualizado a " + añoPublicacion);
        } else {
            System.out.println("Año de publicación inválido: debe ser positivo y no mayor al año actual.");
        }
    }

    // Muestra información completa del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
    }

    // Main: prueba de la clase
    public static void main(String[] args) {
        Libro libro = new Libro("El Quijote", "Miguel de Cervantes", 1605);
        libro.setAñoPublicacion(-100); // Intento inválido
        libro.setAñoPublicacion(2020); // Cambio válido
        libro.mostrarInfo();            // Mostrar datos finales
    }
}
