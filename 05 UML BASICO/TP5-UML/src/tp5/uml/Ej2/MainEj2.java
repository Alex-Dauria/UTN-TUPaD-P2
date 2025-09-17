package Ej2;

public class MainEj2 {
    public static void main(String[] args) {
        Bateria b = new Bateria("BT-100", 4000);
        Usuario u = new Usuario("Ana Gomez", "87654321");
        Celular c = new Celular("IMEI123", "MarcaX", "ModeloY", b, u);
        System.out.println("Celular: " + c.getMarca() + " " + c.getModelo() + ", Usuario: " + c.getUsuario().getNombre() + ", Bateria: " + c.getBateria().getModelo());
    }
}