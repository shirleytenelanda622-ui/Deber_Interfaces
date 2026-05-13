public class PagoTarjeta implements Pagable{
    private double comision = 5.0;
    @Override
    public void procesarPago(double monto){
        if(monto > 0){
            System.out.println("\n--- Pago con tarjeta ---");
            System.out.println("Monto: " + monto);
            System.out.println("Comision: $" + comision);
            System.out.println("Total debitado: " + (monto + comision));
        }
    }
}
