package Ej4;

public class MainEj4 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Luis", "11223344");
        Banco banco = new Banco("Banco Central", "30-12345678-9");
        TarjetaDeCredito t = new TarjetaDeCredito("4000123412341234", "12/28", cliente, banco);
        System.out.println("Tarjeta: " + t.getNumero() + ", Cliente: " + t.getCliente().getNombre() + ", Banco: " + t.getBanco().getNombre());
    }
}