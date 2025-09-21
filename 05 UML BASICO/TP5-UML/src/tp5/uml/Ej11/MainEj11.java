package Ej11;

public class MainEj11 {
    public static void main(String[] args) {
        Artista artista = new Artista("Shakira", "Pop");
        Cancion cancion = new Cancion("Antología", artista);
        Reproductor r = new Reproductor();
        r.reproducir(cancion); // Dependencia de uso
    }
}