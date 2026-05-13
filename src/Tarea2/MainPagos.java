public class MainPagos {
    public static void main(String[] args){
        Pagable e = new PagoEfectivo();
        Pagable ta = new PagoTarjeta();
        Pagable tr = new Transferencia();
        e.procesarPago(50);
        ta.procesarPago(100);
        tr.procesarPago(200);
    }
}
