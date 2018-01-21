package sample.stringOperations;

import org.junit.Before;
import org.junit.Test;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class stringOpeTest {
    @Before
    public void setup(){
    }

    @Test
    public void stringStreamTest() {
        List<String> list = new ArrayList<>();
        String[] s = {"I", "am", "Sam", "."};
    }

    @Test
    public void messageFormatTest() {
        int number = 13;
        String name = "apples";

        String message = MessageFormat.format("I have {0} {1}.", number, name);
        System.out.println(message);
    }


}