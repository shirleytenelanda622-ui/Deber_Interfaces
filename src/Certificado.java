public class Certificado implements Imprimible{
    private String carrera = "software";
    @Override
    public void imprimir(){
        System.out.println("\n--- Imprimiendo certificado ---");
        System.out.println("Estudiante: Maria Perez");
        System.out.println("Carrera: " + carrera);
        System.out.println("Estado: APROBADO");
    }
}
