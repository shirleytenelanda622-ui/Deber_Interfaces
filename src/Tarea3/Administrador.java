public class Administrador implements Autenticable, Reportable, Gestionable {

    private String usuarioCorrecto = "admin";
    private String claveCorrecta = "admin123";

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        if (usuario.equals(usuarioCorrecto) && clave.equals(claveCorrecta)) {
            System.out.println("Administrador autenticado correctamente.");
            return true;
        } else {
            System.out.println("Error: Usuario o clave incorrectos.");
            return false;
        }
    }

    @Override
    public void generarReporte() {
        System.out.println("Administrador generando reportes generales...");
    }

    @Override
    public void gestionarDatos() {
        System.out.println("Administrador gestionando usuarios y sistema...");
    }
}
