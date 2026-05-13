public class PagoEfectivo implements Pagable{
    @Override
    public void procesarPago(double monto){
        if(monto > 0){
            System.out.println("\n--- Pago en efectivo ---");
            System.out.println("Monto: " + monto);
        }
    }
}
