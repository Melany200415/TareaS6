package Institucion;

public class ActaNotas implements Imprimible{
    private String carrera;
    public ActaNotas (String carrera){
        this.carrera=carrera;
    }
    @Override
    public void imprimir(){
        System.out.println("Se imprimira el Acta de notas ");
        System.out.println("Carrera: "+carrera);
    }
}
