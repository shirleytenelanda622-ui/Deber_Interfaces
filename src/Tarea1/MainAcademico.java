public class MainAcademico {
    public static void main(String[] args) {
        Imprimible c = new Certificado();
        Imprimible a = new ActaNotas();
        Imprimible h = new HorarioAcademico();
        c.imprimir();
        a.imprimir();
        h.imprimir();
    }
}
