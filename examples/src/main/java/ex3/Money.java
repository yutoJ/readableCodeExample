package ex3;

public class Money {
    private int amount;

    public Money(int amount) {
        this.validate(amount);
        this.amount = amount;
    }

    public Money minus(Money ohter){
        int amount = this.amount - ohter.amount;
        return new Money(amount);
    }

    private void validate(int amount){
        if (amount < 0 ) throw new IllegalArgumentException("Illegal value: this amount is under 0, this amount is " + amount );
    }

    public int amount(){
        return this.amount;
    }

}
