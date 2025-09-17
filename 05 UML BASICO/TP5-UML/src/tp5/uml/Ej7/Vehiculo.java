package Ej7;

// Clase Vehiculo
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; // Agregación
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
        conductor.setVehiculo(this); // Asociación bidireccional
    }

    // Getters y setters
    public String getPatente() { return patente; }
    public void setPatente(String patente) { this.patente = patente; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public Motor getMotor() { return motor; }
    public void setMotor(Motor motor) { this.motor = motor; }
    public Conductor getConductor() { return conductor; }
    public void setConductor(Conductor conductor) { this.conductor = conductor; }
}