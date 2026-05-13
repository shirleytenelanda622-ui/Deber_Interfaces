import java.util.Scanner;

public class MainEmpresa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE USUARIOS ===");
        System.out.println("1. Cajero");
        System.out.println("2. Administrador");
        System.out.println("3. Supervisor");
        System.out.print("Seleccione un rol: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Clave: ");
        String clave = sc.nextLine();

        switch (opcion) {
            case 1:
                Cajero cajero = new Cajero();
                if (cajero.iniciarSesion(usuario, clave)) {
                    cajero.gestionarDatos();
                }
                break;

            case 2:
                Administrador admin = new Administrador();
                if (admin.iniciarSesion(usuario, clave)) {
                    admin.gestionarDatos();
                    admin.generarReporte();
                }
                break;

            case 3:
                Supervisor supervisor = new Supervisor();
                if (supervisor.iniciarSesion(usuario, clave)) {
                    supervisor.generarReporte();
                }
                break;

            default:
                System.out.println("Opción inválida.");
        }

        sc.close();
    }
}
