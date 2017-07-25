package ex1;

public class Exe {

    public static void main(String[] args) {
        int basePrice = 100;

        ShippingCost shippingCost = new ShippingCost(basePrice);

        System.out.println("shippingCost is " + shippingCost.shippingCost() + " Yen");

    }
}
