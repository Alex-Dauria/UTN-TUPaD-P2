package Ej6;

public class MainEj6 {
    public static void main(String[] args) {
        Cliente c = new Cliente("Mariana", "11223344");
        Mesa m = new Mesa(5, 4);
        Reserva r = new Reserva("2025-09-17", "20:00", c, m);
        System.out.println("Reserva para: " + r.getCliente().getNombre() + " en mesa " + r.getMesa().getNumero());
    }
}