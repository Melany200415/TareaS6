package Empresa;

public class Cajero implements Autenticable, Gestionable {

private String usuario ="Cajero";
private String clave = "1234";

@Override
    public boolean iniciarSesion(String usuario ,String clave) {
    if (this.usuario.equals(usuario)&& this.clave.equals(clave)){
        System.out.println("Inicio de sesion correcto de cajero");
        return true;
    }else{
        System.out.println("El usuario o contraseña es incorrectos");
        return false;
    }
}
    @Override
    public void gestionarDatos(){
        System.out.println("El cajero esta gestionando datos");

    }
}
