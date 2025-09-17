package Ej1;

// Clase Pasaporte
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; // Composición: Foto se crea dentro de Pasaporte
    private Titular titular;

    public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagenFoto, formatoFoto); // Composición
        this.titular = titular;
        titular.setPasaporte(this); // Asociación bidireccional
    }

    // Getters y setters
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(String fechaEmision) { this.fechaEmision = fechaEmision; }
    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }
    public void setTitular(Titular titular) { this.titular = titular; }
}