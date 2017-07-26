package ex7;

public class AdultFee implements Fee {


    public Yen yen() {
        return new Yen(3000);
    }

    public CustomerType label() {
        return CustomerType.ADULT;
    }
}
