package ex1;

public class ShippingCost {

    private final int basicShippingCost = 500;
    private final int limitPriceForFree = 3000;

    private int amount;

    public ShippingCost(int basePrice) {
        this.amount = 0;
        if (isNotFreeDelivery(basePrice)) this.amount += basicShippingCost;
    }

    private boolean isNotFreeDelivery(int basePrice){
        return basePrice < limitPriceForFree;
    }

    public int shippingCost(){
        return this.amount;

    }

}
