
public class Main {
    public static void main(String[] args) {
        // Crear empleados
        Empleado emp1 = new Empleado(1, "Alex Dauria", "Programador", 2500.0);
        Empleado emp2 = new Empleado("Nicolas Gonzalez", "Ingeniero");
        Empleado emp3 = new Empleado("Marta Rodriguez", "Gerente");
        

        // Aplicar aumentos
        emp1.actualizarSalario(10.0); // 10% de aumento
        emp2.actualizarSalario(500);  // Aumento fijo

        // Mostrar información
        System.out.println("=== Empleados ===");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        // Mostrar total de empleados
        System.out.println("\nTotal de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
