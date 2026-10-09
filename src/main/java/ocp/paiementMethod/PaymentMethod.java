package ocp.paiementMethod;

public abstract class PaymentMethod {

    private final PaymentType type;

    public PaymentMethod(PaymentType type) {this.type = type;}

    public PaymentType getType() {
        return type;
    }

    public abstract void pay(double payment);
}
