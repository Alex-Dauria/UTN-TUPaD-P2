package Ej10;

public class MainEj10 {
    public static void main(String[] args) {
        Titular t = new Titular("Mario", "99887766");
        CuentaBancaria c = new CuentaBancaria("000111222333", 1500.0, "CLAVE123", "2025-09-01");
        t.setCuenta(c);
        System.out.println("Cuenta: " + c.getCbu() + ", Titular: " + c.getTitular().getNombre() + ", Clave: " + c.getClaveSeguridad().getCodigo());
    }
}