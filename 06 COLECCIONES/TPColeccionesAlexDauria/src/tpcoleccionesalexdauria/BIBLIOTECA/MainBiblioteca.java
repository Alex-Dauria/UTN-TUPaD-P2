
package tpcoleccionesalexdauria.BIBLIOTECA;

public class MainBiblioteca {
    public static void main(String[] args) {
        // 1. Crear biblioteca
        Biblioteca bib = new Biblioteca("Biblioteca Central");

        // 2. Crear 3 autores
        Autor a1 = new Autor("A1", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("A2", "Jorge Luis Borges", "Argentina");
        Autor a3 = new Autor("A3", "Julio Cortázar", "Argentina");

        // 3. Agregar 5 libros
        bib.agregarLibro("L001", "Cien años de soledad", 1967, a1);
        bib.agregarLibro("L002", "El Aleph", 1949, a2);
        bib.agregarLibro("L003", "Rayuela", 1963, a3);
        bib.agregarLibro("L004", "Crónica de una muerte anunciada", 1981, a1);
        bib.agregarLibro("L005", "Ficciones", 1944, a2);

        // 4. Listar libros
        System.out.println("=== TODOS LOS LIBROS ===");
        bib.listarLibros();

        // 5. Buscar por ISBN
        System.out.println("=== BUSCAR POR ISBN L003 ===");
        Libro encontrado = bib.buscarLibroPorIsbn("L003");
        if (encontrado != null) encontrado.mostrarInfo();

        // 6. Filtrar por año
        System.out.println("=== LIBROS DE 1949 ===");
        bib.filtrarLibrosPorAnio(1949);

        // 7. Eliminar libro
        System.out.println("=== ELIMINAR L004 ===");
        bib.eliminarLibro("L004");
        bib.listarLibros();

        // 8. Cantidad total
        System.out.println("=== CANTIDAD TOTAL: " + bib.obtenerCantidadLibros());

        // 9. Mostrar autores
        System.out.println("=== AUTORES DISPONIBLES ===");
        bib.mostrarAutoresDisponibles();
    }
}
