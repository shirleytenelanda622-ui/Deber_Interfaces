public class Supervisor implements Autenticable, Reportable {
    private String usuarioCorrecto = "supervisor";
    private String claveCorrecta = "456";
    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        if (usuario.equals(usuarioCorrecto) && clave.equals(claveCorrecta)) {
            System.out.println("Supervisor autenticado correctamente.");
            return true;
        } else {
            System.out.println("Error: Usuario o clave incorrectos.");
            return false;
        }
    }
    @Override
    public void generarReporte() {
        System.out.println("Supervisor generando reportes de supervisión...");
    }
}
