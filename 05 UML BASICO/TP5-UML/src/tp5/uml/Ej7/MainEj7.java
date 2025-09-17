package Ej7;

public class MainEj7 {
    public static void main(String[] args) {
        Motor m = new Motor("V6", "MSN123");
        Conductor c = new Conductor("Roberto", "LIC123");
        Vehiculo v = new Vehiculo("ABC123", "ModeloZ", m, c);
        System.out.println("Vehiculo: " + v.getPatente() + ", Conductor: " + v.getConductor().getNombre() + ", Motor: " + v.getMotor().getTipo());
    }
}