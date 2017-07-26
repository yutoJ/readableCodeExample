package ex7;

public class SeniorFee implements Fee {
    public Yen yen() {
        return new Yen(2000);
    }

    public CustomerType label() {
        return CustomerType.SENIOR;
    }
}
