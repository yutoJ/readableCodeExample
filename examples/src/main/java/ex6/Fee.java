package ex6;

public class Fee {

    private int fee;
    private static final int childfee = 1000;
    private static final int seniorfee = 2000;
    private static final int adultfee = 3000;

    public Fee(Customer customer) {

        fee = caculateFee(customer);
    }

    private boolean isChild(Customer customer){
        return customer.type().equals(CustomerType.CHILD);
    }

    private boolean isSenior(Customer customer){
        return customer.type().equals(CustomerType.SENIOR);
    }

    private boolean isAdult(Customer customer){
        return customer.type().equals(CustomerType.ADULT);
    }

    public int fee() {
        return fee;
    }

    private int caculateFee(Customer customer){
        if (isChild(customer)) return childfee;
        if (isSenior(customer)) return seniorfee;

        return adultfee;
    }
}
