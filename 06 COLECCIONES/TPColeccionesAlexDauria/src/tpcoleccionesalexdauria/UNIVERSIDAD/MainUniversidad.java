
package tpcoleccionesalexdauria.UNIVERSIDAD;

public class MainUniversidad {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Nacional");

        // 1. Crear 3 profesores y 5 cursos
        Profesor p1 = new Profesor("P1", "Ana García", "Matemáticas");
        Profesor p2 = new Profesor("P2", "Luis Martínez", "Historia");
        Profesor p3 = new Profesor("P3", "Carlos López", "Programación");

        Curso c1 = new Curso("C1", "Álgebra");
        Curso c2 = new Curso("C2", "Cálculo");
        Curso c3 = new Curso("C3", "Historia Mundial");
        Curso c4 = new Curso("C4", "Programación I");
        Curso c5 = new Curso("C5", "Programación II");

        // 2. Agregar a universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);
        
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // 3. Asignar profesores a cursos
        uni.asignarProfesorACurso("C1", "P1");
        uni.asignarProfesorACurso("C2", "P1");
        uni.asignarProfesorACurso("C3", "P2");
        uni.asignarProfesorACurso("C4", "P3");
        uni.asignarProfesorACurso("C5", "P3");

        // 4. Listar
        System.out.println("=== CURSOS ===");
        uni.listarCursos();
        System.out.println("=== PROFESORES ===");
        uni.listarProfesores();

        // 5. Cambiar profesor
        System.out.println("=== CAMBIAR PROFESOR DE C5 A P2 ===");
        uni.asignarProfesorACurso("C5", "P2");
        uni.listarCursos();
        uni.listarProfesores();

        // 6. Remover curso
        System.out.println("=== ELIMINAR CURSO C1 ===");
        uni.eliminarCurso("C1");
        uni.listarCursos();

        // 7. Remover profesor
        System.out.println("=== ELIMINAR PROFESOR P3 ===");
        uni.eliminarProfesor("P3");
        uni.listarCursos();
        uni.listarProfesores();

        // 8. Reporte
        uni.mostrarReporteCursosPorProfesor();
    }
}
