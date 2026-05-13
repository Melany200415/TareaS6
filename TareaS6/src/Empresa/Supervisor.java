package Empresa;

public class Supervisor implements Autenticable, Reportable{
    //Atributos
    private String usuario = "Supervisor";
    private String clave = "0003";
    @Override
    public boolean iniciarSesion(String usuario, String clave){
        if (this.usuario.equals(usuario)&& this.clave.equals(clave)){
            System.out.println("Inicio de sesion correcto del supervisor ");
            return true;
        }else{
            System.out.println("El usuario o contraseña es incorrectos");
            return false;
        }
    }
    @Override
    public void generarReporte(){
        System.out.println("El supervisor esta  generando el reporte");
    }
}
