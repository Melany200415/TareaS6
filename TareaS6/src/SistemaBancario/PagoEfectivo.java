package SistemaBancario;

public class PagoEfectivo implements Pagable{
@Override
    public void procesarPago(double monto){
    if (monto>0){
        System.out.println("---------------------");
        System.out.println("El pago en Efectivo ");
        System.out.println("Monto pagado: "+monto);
        System.out.println("---------------------");
    }

}
}
