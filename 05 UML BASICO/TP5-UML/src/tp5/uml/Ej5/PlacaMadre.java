package Ej5;

// Clase PlacaMadre
public class PlacaMadre {
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    // Getters y setters
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getChipset() { return chipset; }
    public void setChipset(String chipset) { this.chipset = chipset; }
}