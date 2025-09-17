package Ej5;

public class MainEj5 {
    public static void main(String[] args) {
        Propietario p = new Propietario("Carlos", "55667788");
        Computadora pc = new Computadora("Brand", "SN12345", "X570", "AMD", p);
        System.out.println("Computadora: " + pc.getMarca() + ", Propietario: " + pc.getPropietario().getNombre() + ", Placa: " + pc.getPlacaMadre().getModelo());
    }
}