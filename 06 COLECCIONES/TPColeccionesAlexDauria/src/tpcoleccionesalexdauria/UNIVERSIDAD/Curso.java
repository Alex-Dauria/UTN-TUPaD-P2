
package tpcoleccionesalexdauria.UNIVERSIDAD;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void setProfesor(Profesor p) {
        // Remover de profesor anterior
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        
        // Asignar nuevo profesor
        this.profesor = p;
        if (p != null) {
            p.agregarCurso(this);
        }
    }

    public void mostrarInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Profesor: " + (profesor != null ? profesor.getNombre() : "Sin asignar"));
        System.out.println("----------------------------");
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }
    
    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", profesor=" + (profesor != null ? profesor.getNombre() : "null") +
                '}';
    }
}