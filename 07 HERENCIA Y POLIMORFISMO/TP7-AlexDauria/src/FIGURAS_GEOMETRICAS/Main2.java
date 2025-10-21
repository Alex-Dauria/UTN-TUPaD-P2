
package FIGURAS_GEOMETRICAS;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo("Circulo 1", 5));
        figuras.add(new Rectangulo("Rectangulo 1", 4, 6));

        for (Figura figura : figuras) {
            figura.mostrarArea();
        }
    }
}

