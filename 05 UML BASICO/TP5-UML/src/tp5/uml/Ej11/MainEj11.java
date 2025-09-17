package Ej11;

public class MainEj11 {
    public static void main(String[] args) {
        Artista a = new Artista("The Band", "Rock");
        Cancion s = new Cancion("Song 1", a);
        Reproductor r = new Reproductor();
        r.reproducir(s);
    }
}