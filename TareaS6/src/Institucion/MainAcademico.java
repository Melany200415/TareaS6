package Institucion;

public class MainAcademico {
    public static void main(String[] args) {
            Certificado c = new Certificado("1753");
        ActaNotas ac = new ActaNotas("Poo");
        HorarioAcademico ha = new HorarioAcademico("2026-A");

        c.imprimir();
        ac.imprimir();
        ha.imprimir();

    }
}