package SistemaBancario;

public class MainPagos {
    public static void main(String[] args){
        PagoEfectivo pe= new PagoEfectivo();
        PagoTarjeta pt = new PagoTarjeta();
        Transferencia t =new Transferencia();
        pe.procesarPago(20);
        pt.procesarPago(50);
        t.procesarPago(485);

    }
}
