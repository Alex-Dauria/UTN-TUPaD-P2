package Ej10;

// Clase CuentaBancaria
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad; // Composición
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String codigoClave, String ultimaModClave, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigoClave, ultimaModClave); // Composición
        this.titular = titular;
        titular.setCuenta(this); // Asociación bidireccional
    }

    // Getters y setters
    public String getCbu() { return cbu; }
    public void setCbu(String cbu) { this.cbu = cbu; }
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public ClaveSeguridad getClaveSeguridad() { return claveSeguridad; }
    public Titular getTitular() { return titular; }
    public void setTitular(Titular titular) { this.titular = titular; }
}