package ocp;

import ocp.paiementMethod.*;

public class PaymentProcessor {

    public void processPayment(double payment, PaymentMethod paymentMethod) {
        PaymentType paymentType = paymentMethod.getType();
        if (paymentType.equals(PaymentType.CREDIT_CARD)) {
            ((CreditCardPayment) paymentMethod).payWithCreditCard(payment);
        } else if (paymentType.equals(PaymentType.PAY_PAL)) {
            ((PayPalPayment) paymentMethod).payWithPayPal(payment);
        } else if (paymentType.equals(PaymentType.CRYPTO)) {
            ((CryptoPayment) paymentMethod).payWithCrypto(payment);
        }
    }
    public void sendPaymentsReport() {
        EmailReportSender emailReportSender = new EmailReportSender();
        emailReportSender.sendReport();
    }
}
