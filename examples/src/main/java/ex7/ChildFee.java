package ex7;

public class ChildFee implements Fee {
    public Yen yen() {
        return new Yen(1000);
    }

    public CustomerType label() {
        return CustomerType.CHILD;
    }

}
