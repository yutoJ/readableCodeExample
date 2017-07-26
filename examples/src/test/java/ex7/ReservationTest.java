package ex7;

import org.hamcrest.beans.SamePropertyValuesAs;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ReservationTest {
    @Test
    public void feeTotal() throws Exception {

        Yen expected = new Yen(7000);

        Reservation reservation = new Reservation();
        reservation.addFee(new AdultFee());
        reservation.addFee(new ChildFee());
        reservation.addFee(new AdultFee());

        Yen actual = reservation.feeTotal();

        //assertThat(actual, is(expected));
        assertThat(actual, is(SamePropertyValuesAs.samePropertyValuesAs(expected)));
    }

    @Test
    public void factoryTest() throws Exception{

        FeeFactory feeFactory = new FeeFactory();

        Fee adultFee = FeeFactory.feeByName("adult");
        Fee illegalFee = FeeFactory.feeByName("baby");

        Fee adultFee2 = FeeFactory.feeByName("adult");

        System.out.println("adult fee: " + adultFee.label());

        assertEquals(adultFee, adultFee2);
        assertNull(illegalFee);
        //System.out.println("Illegal fee: " + illegalFee.label());
    }

    @Test
    public void enumTest() throws Exception{

        FeeType adult = FeeType.adult;
        FeeType adult2 = FeeType.adult;
        System.out.println("ADULT: " + adult + ", ADULT2: " + adult2);
        assertEquals(adult, adult2);



    }

}