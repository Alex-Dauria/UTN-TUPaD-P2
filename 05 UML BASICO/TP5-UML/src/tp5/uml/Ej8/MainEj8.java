package Ej8;

public class MainEj8 {
    public static void main(String[] args) {
        Usuario u = new Usuario("Paula", "paula@example.com");
        Documento d = new Documento("Contrato", "Contenido...", "HASH123", "2025-09-17", u);
        System.out.println("Documento: " + d.getTitulo() + ", Firmado por: " + d.getFirmaDigital().getUsuario().getNombre());
    }
}