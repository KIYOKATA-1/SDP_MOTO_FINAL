public class QRPaymentA implements QR{
    private Motorcycle motorcycle;

    public QRPaymentA(Motorcycle motorcycle){
        this.motorcycle = motorcycle;
    }


    @Override
    public void processPayment() {
        System.out.println("Processing QR payment for : " + motorcycle.getDescription());
    }
}
