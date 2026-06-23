package Ejercicio_09;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Humberto Humbert", "FONASA");

        Profesional medico = new Profesional("Dr. Señor Doctor", "Astrogastroenterólogo");

        CitaMedica turno = new CitaMedica("11/06/2026", "19:45", paciente, medico);

        System.out.println("Turno programado para el día: " + turno.getFecha() + " a las " + turno.getHora() + " hs.");
        System.out.println("Paciente: " + turno.getPaciente().getNombre() + " (Cobertura: " + turno.getPaciente().getObraSocial() + ")");
        System.out.println("Atendido por: " + turno.getProfesional().getNombre() + " [" + turno.getProfesional().getEspecialidad() + "]");
    }
}