// Ejercicio 4: Gestión de Gallinas en Granja Digital - Alex Dauria

public class Gallina {
    private String idGallina;     // Identificador de la gallina
    private int edad;             // Edad actual
    private int huevosPuestos;    // Cantidad de huevos puestos

    // Constructor: inicializa todos los atributos
    public Gallina(String idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }

    // Simula que la gallina pone un huevo
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println(idGallina + " ha puesto un huevo.");
    }

    // Simula que la gallina envejece un año
    public void envejecer() {
        edad++;
        System.out.println(idGallina + " ha envejecido un año.");
    }

    // Muestra estado completo de la gallina
    public void mostrarEstado() {
        System.out.println("ID: " + idGallina);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Huevos Puestos: " + huevosPuestos);
    }

    // Main: prueba de la clase
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina("G001", 2, 50);
        Gallina gallina2 = new Gallina("G002", 3, 70);

        // Simulación de acciones de la gallina 1
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.mostrarEstado();

        // Simulación de acciones de la gallina 2
        gallina2.envejecer();
        gallina2.ponerHuevo();
        gallina2.mostrarEstado();
    }
}
