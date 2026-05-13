package Empresa;
// Utilizo Scanner por que voy ingresar datos
import java.util.Scanner;
public class MainEmpresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cajero c = new Cajero();
        Administrador ad = new Administrador();
        Supervisor s = new Supervisor();
        // En el main crear el menu segun los roles
        System.out.println("----ROLES----");
        System.out.println("1.Cajero");
        System.out.println("2.Administrador");
        System.out.println("3.Supervisor");
        System.out.println("Seleccione una opcion: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        System.out.println("Ingrese el nombre del usuario ");
        String usuario = sc.nextLine();

        System.out.println("Ingrese la clave: ");
        String clave = sc.nextLine();
        if (opcion == 1) {
            if (c.iniciarSesion(usuario, clave)) {
                c.gestionarDatos();
                ;
            }
        } else if (opcion == 2) {
            if (ad.iniciarSesion(usuario, clave)) {
                ad.generarReporte();
                ad.gestionarDatos();

            }
        } else if ( opcion == 3) {
            if (s.iniciarSesion(usuario, clave)) {
                s.generarReporte();
            }
        }else {
            System.out.println("La opcion es incorrecta");

        }
    }
    }