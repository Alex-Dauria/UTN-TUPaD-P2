
package FIGURAS_GEOMETRICAS;

public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public String getNombre() {
        return nombre;
    }

    public void mostrarArea() {
        System.out.println(getNombre() + ": " + calcularArea());
    }
}


