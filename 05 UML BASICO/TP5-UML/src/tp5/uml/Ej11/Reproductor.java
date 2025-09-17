package Ej11;

// Clase Reproductor
public class Reproductor {
    // Dependencia de uso: usa Cancion como parámetro, no la almacena
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo());
    }
}