package Ej13;

public class MainEj13 {
    public static void main(String[] args) {
        Usuario user = new Usuario("Elena Soto", "elena@gmail.com");
        GeneradorQR gen = new GeneradorQR();
        gen.generar("ABC-123", user); // dependencia de creación
    }
}