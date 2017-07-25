package ex3;

public class Exe {

    public static void main(String[] args) {
        int value = 1000;
        Money money = new Money(value);
        System.out.println(money.amount() + " Yen");

        Money money1 = money.minus(new Money(500));

        System.out.println(money1.amount() + " Yen");

        Money IllegalMoney = money1.minus(new Money(600));

        System.out.println(IllegalMoney.amount() + " Yen");


    }
}
