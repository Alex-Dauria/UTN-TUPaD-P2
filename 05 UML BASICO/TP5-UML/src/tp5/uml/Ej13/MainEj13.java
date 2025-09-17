package Ej13;

public class MainEj13 {
    public static void main(String[] args) {
        Usuario u = new Usuario("Diego", "diego@example.com");
        GeneradorQR g = new GeneradorQR();
        g.generar("VALOR123", u);
    }
}