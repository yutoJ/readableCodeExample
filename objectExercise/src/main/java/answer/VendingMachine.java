package answer;

import java.util.HashMap;
import java.util.Map;

/**
 * Vending Machine
 */
public class VendingMachine {

    private final Map<Drink, Integer> drinkStock = new HashMap<Drink, Integer>();
    private final Map<Coin, Integer> coinStock = new HashMap<Coin, Integer>();

    public VendingMachine() {
        this.load();
    }

    /**
     * buy drink. All drinks cost 100 yen.
     */
    public Coin[] buy(final Drink coke, final Coin oneHundred) {
        return null;
    }

    /**
     * insert drinks.
     **/
    public void insertDrink(final Drink drink,final int addNumber) {
        if(this.drinkStock.containsKey(drink)) {
            int stockedNumber = drinkStock.get(drink);
            this.drinkStock.remove(drink);
            this.drinkStock.put(drink, stockedNumber + addNumber);
        }else {
            this.drinkStock.put(drink, addNumber);
        }
    }

    /**
     * insert coins.
     */
    public void insertCoin(final Coin coin,final int addNumber) {
        if(this.coinStock.containsKey(coin)) {
            int stockedNumber = coinStock.get(coin);
            this.coinStock.remove(coin);
            this.coinStock.put(coin, stockedNumber + addNumber);

        }else {
            this.coinStock.put(coin, addNumber);
        }
    }

    /**
     * show number of coins left in VM.
     */
    public int numberOfCoin(final Coin coin){
        if(this.coinStock.containsKey(coin)) {
            return this.coinStock.get(coin);
        } else {
            throw new IllegalArgumentException(coin.name() + " is not in vending machine.");
        }
    }

    /**
     * show number of drinks left in VM.
     */
    public int numberOfDrink(final Drink drink){
        if(this.drinkStock.containsKey(drink)) {
            return this.drinkStock.get(drink);
        } else {
            throw new IllegalArgumentException(drink.name() + " is not in vending machine.");
        }
    }

    //TODO load from DB
    private void load() {
        this.drinkStock.put(Drink.COKE, 0);
        this.drinkStock.put(Drink.TEA, 0);
        this.drinkStock.put(Drink.WATER, 0);
        this.coinStock.put(Coin.FiveHundred, 0);
        this.coinStock.put(Coin.OneHundred, 0);
    }
}
