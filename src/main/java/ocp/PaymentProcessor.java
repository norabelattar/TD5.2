package ocp;

import ocp.paiementMethod.*;

public class PaymentProcessor {
    private ReportSenderFactory reportSenderFactory;

    public void processPayment(double payment, PaymentMethod paymentMethod) {
        paymentMethod.pay(payment);
    }
    public void sendPaymentsReport() {
        ReportSender reportSender = reportSenderFactory.creat();
        reportSender.sendReport();
    }
}
