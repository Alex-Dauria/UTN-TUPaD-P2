
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    // Constructor completo
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor simplificado
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 1;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000.0; // Salario por defecto
        totalEmpleados++;
    }

    // Métodos sobrecargados para actualizar salario
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }

    // Método estático
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // toString
    @Override
    public String toString() {
        return String.format("ID: %d | Nombre: %s | Puesto: %s | Salario: $%.2f", id, nombre, puesto, salario);
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}
