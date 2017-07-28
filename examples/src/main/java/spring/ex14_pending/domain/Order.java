package spring.ex14_pending.domain;

public class Order {

    private Customer customer;
    private PaymentMethod paymentMethod;
    private DeliverySpecification deliverySpecification;
    private ContactTo contactTo;

    public boolean isValid(){


        return false;
    }

    public void submit() {
    }
}
