package Ej5;

// Clase Computadora
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre; // Composición
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipsetPlaca, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipsetPlaca); // Composición
        this.propietario = propietario;
        propietario.setComputadora(this); // Asociación bidireccional
    }

    // Getters y setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }
    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public Propietario getPropietario() { return propietario; }
    public void setPropietario(Propietario propietario) { this.propietario = propietario; }
}