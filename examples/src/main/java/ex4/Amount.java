package ex4;

import ex3.Money;

public class Amount {

    private int amount;

    public Money amount(Price price, Quantity quantity){
        int value = price.value() * quantity.value();
        return new Money(value);
    }
}
