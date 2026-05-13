public class Transferencia implements Pagable{
    private double comision = 4.0;
    @Override
    public void procesarPago(double monto){
        if(monto > 0){
            System.out.println("\n--- Transferencia ---");
            System.out.println("Monto: " + monto);
            System.out.println("Comision: " + comision);
            System.out.println("Total transferido: " + (monto + comision));
        }
    }
}
