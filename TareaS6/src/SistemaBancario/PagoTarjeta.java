package SistemaBancario;

public class PagoTarjeta implements Pagable{
    private double comision= 1.50;

    @Override
    public void procesarPago(double monto) {
        if (monto>0){
            double total = monto + comision;
            System.out.println("---------------------");
            System.out.println("El pago en Tarjeta  ");
            System.out.println("Monto pagado: "+monto);
            System.out.println("Comision: "+comision);
            System.out.println("Total: "+total);
            System.out.println("---------------------");
        }
    }
}
