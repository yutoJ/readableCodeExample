package ex6;

import org.junit.Test;

import static org.junit.Assert.*;

public class FeeTest {

    Customer customer;

    @Test
    public void childFee() throws Exception {
        int expected = 1000;

        customer = new Customer("Tom", CustomerType.CHILD);

        Fee childFee = new Fee(customer);

        assertEquals(childFee.fee(), expected);

    }

    @Test
    public void adultFee() throws Exception {
        int expected = 3000;

        customer = new Customer("Tom", CustomerType.ADULT);

        Fee adultFee = new Fee(customer);

        assertEquals(adultFee.fee(), expected);

    }


}