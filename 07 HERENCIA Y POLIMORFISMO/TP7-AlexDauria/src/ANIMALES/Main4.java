
package ANIMALES;

import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Rex"));
        animales.add(new Gato("Misi"));
        animales.add(new Vaca("Lola"));

        for (Animal animal : animales) {
            animal.describirAnimal();
        }
    }
}


