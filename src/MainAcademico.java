//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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