public class Cajero implements Autenticable, Gestionable {

    private String usuarioCorrecto = "cajero";
    private String claveCorrecta = "123";

    @Override
    public boolean iniciarSesion(String usuario, String clave) {
        if (usuario.equals(usuarioCorrecto) && clave.equals(claveCorrecta)) {
            System.out.println("Cajero autenticado correctamente.");
            return true;
        } else {
            System.out.println("Error: Usuario o clave incorrectos.");
            return false;
        }
    }

    @Override
    public void gestionarDatos() {
        System.out.println("Cajero gestionando cobros y pagos...");
    }
}
