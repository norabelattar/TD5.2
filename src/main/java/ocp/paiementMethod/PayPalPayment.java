package ocp.paiementMethod;

public class PayPalPayment extends PaymentMethod {
    public PayPalPayment() {
        super(PaymentType.PAY_PAL);
    }
    public void payWithPayPal(double payment) {
        System.out.println("Paiement via PayPal effectué.");
    }
}