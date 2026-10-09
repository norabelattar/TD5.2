package ocp.paiementMethod;

public class PaymentMethod {

    private final PaymentType type;

    public PaymentMethod(PaymentType type) {this.type = type;}

    public PaymentType getType() {
        return type;
    }
}
