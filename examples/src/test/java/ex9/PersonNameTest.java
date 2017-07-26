package ex9;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonNameTest {
    @Test
    public void fullName() throws Exception {

        String expected = "don diablo";
        PersonName person = new PersonName("don", "diablo");

        assertEquals(person.fullName(), expected);

    }

}