package ocp.paiementMethod;

public class CryptoPayment extends PaymentMethod {
    public CryptoPayment() {
        super(PaymentType.CRYPTO);
    }

    public void pay(double payment) {
        System.out.println("Paiement en crypto effectué.");
    }
}