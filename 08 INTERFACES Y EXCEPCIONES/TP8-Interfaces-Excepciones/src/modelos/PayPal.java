
package modelos;

import interfaces.Pago;

public class PayPal implements Pago {
    private String email;
    
    public PayPal(String email) {
        this.email = email;
    }
    
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal por: $" + monto);
        System.out.println("Email: " + email);
    }
}
