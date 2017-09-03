package answer;

import org.hamcrest.beans.SamePropertyValuesAs;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class VendingMachineTest {

    private VendingMachine vendingMachine;
    private Coin[] returns;

    @Before public void initialize() {
        vendingMachine = new VendingMachine();
    }

    @Test
    public void VendingMachineTest() throws Exception{

        returns = vendingMachine.buy(Drink.COKE, Coin.OneHundred);
        assertNull(returns);

        //assertEquals(adultFee, adultFee2);
        //assertNull(illegalFee);
    }

}