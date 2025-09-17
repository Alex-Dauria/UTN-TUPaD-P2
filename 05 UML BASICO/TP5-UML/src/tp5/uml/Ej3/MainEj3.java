package Ej3;

public class MainEj3 {
    public static void main(String[] args) {
        Autor autor = new Autor("Gabriel Garcia", "Argentina");
        Editorial ed = new Editorial("Editorial Uno", "Calle Falsa 123");
        Libro libro = new Libro("Titulo Ejemplo", "ISBN12345", autor, ed);
        System.out.println("Libro: " + libro.getTitulo() + ", Autor: " + libro.getAutor().getNombre() + ", Editorial: " + libro.getEditorial().getNombre());
    }
}