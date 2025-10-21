
package EMPLEADOS;

public class EmpleadoTemporal extends Empleado {
    private double horasTrabajadas;
    private double pagoPorHora;

    public EmpleadoTemporal(String nombre, double horasTrabajadas, double pagoPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * pagoPorHora;
    }
}


