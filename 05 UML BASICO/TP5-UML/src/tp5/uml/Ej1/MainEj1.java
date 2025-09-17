package Ej1;

public class MainEj1 {
    public static void main(String[] args) {
        Titular titular = new Titular("Juan Perez", "12345678");
        Pasaporte pasaporte = new Pasaporte("ABC123", "2023-01-01", "foto123.jpg", "JPEG", titular);
        System.out.println("Pasaporte: " + pasaporte.getNumero() + ", Titular: " + pasaporte.getTitular().getNombre() + ", Foto: " + pasaporte.getFoto().getImagen());
    }
}