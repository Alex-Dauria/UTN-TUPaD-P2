package Ej9;

public class MainEj9 {
    public static void main(String[] args) {
        Paciente p = new Paciente("Sofia", "OSDE");
        Profesional prof = new Profesional("Dr. Perez", "Cardiologia");
        CitaMedica c = new CitaMedica("2025-09-20", "10:30", p, prof);
        System.out.println("Cita: " + c.getFecha() + " con " + c.getProfesional().getNombre() + " para " + c.getPaciente().getNombre());
    }
}