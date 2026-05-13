package Institucion;

public class HorarioAcademico  implements Imprimible{
    private String periodoAcademico;
    public HorarioAcademico (String periodoAcademico){
        this.periodoAcademico=periodoAcademico;
    }
    @Override
    public void imprimir(){
        System.out.println("Se imprimira el Horario academico ");
        System.out.println("El periodo academico es: "+periodoAcademico);
    }
}

