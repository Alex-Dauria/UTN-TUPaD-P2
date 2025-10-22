
package modelos;

import interfaces.PagoConDescuento;

public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;
    private String titular;
    
    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }
    
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de credito por: $" + monto);
        System.out.println("Tarjeta: " + numeroTarjeta.substring(numeroTarjeta.length() - 4));
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * 0.10; // 10% de descuento
        double montoConDescuento = monto - descuento;
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Monto con descuento: $" + montoConDescuento);
        return montoConDescuento;
    }
}
