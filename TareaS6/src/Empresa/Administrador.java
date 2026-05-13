package Empresa;

public class Administrador implements Autenticable,Reportable,Gestionable{
   private String usuario = "Administrador";
   private String clave = "2560";
   @Override
public boolean iniciarSesion(String usuario, String clave){
       if (this.usuario.equals(usuario)&& this.clave.equals(clave)){
           System.out.println("Inicio de sesion correcto de administrador ");
           return true;
       }else{
           System.out.println("El usuario o contraseña es incorrectos");
           return false;
       }
   }
   @Override
   public void generarReporte(){
       System.out.println("El administrador esta generando el reporte");
   }
   @Override
    public void gestionarDatos(){
       System.out.println("El administrador esta gestionando los datos ");
   }
}
