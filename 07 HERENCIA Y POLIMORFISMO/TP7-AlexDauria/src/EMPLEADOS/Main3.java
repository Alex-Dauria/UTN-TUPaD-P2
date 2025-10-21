
package EMPLEADOS;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Juan", 3000));
        empleados.add(new EmpleadoTemporal("Ana", 40, 20));

        for (Empleado empleado : empleados) {
            System.out.println("Sueldo de " + empleado.getNombre() + ": " + empleado.calcularSueldo());
            if (empleado instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado de Planta");
            } else if (empleado instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Empleado Temporal");
            }
        }
    }
}


