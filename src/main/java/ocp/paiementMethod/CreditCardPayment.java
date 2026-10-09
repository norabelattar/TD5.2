package ocp.paiementMethod;

public class CreditCardPayment extends PaymentMethod {
    public CreditCardPayment() {
        super(PaymentType.CREDIT_CARD);
    }

    public void payWithCreditCard(double payment) {
        System.out.println("Paiement par carte de crédit effectué.");
    }
}