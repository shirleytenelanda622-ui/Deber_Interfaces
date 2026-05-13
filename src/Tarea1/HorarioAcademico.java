public class HorarioAcademico implements Imprimible{
    private int periodoAcademico = 3;
    @Override
    public void imprimir(){
        System.out.println("\n--- Imprimiendo horario academico ---");
        System.out.println("Periodo academico: " + periodoAcademico);
        System.out.println("Lunes: Matematicas 08:00 - 10:00");
        System.out.println("Miercoles: Fisica 08:00 - 10:00");
    }
}
