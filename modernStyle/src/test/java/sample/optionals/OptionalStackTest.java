package sample.optionals;

import org.junit.Before;
import org.junit.Test;
import sample.compare.Student;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.Assert.*;

public class OptionalStackTest {

    OptionalStack<String> optionalStack = new OptionalStack<>();

    @Before
    public void setup(){
    }

    @Test
    public void push() {

    }

    @Test
    public void pop() {
        Optional<String> optional =optionalStack.pop();
        String optElement = optional.orElse("empty");
        System.out.println(optElement);

        optionalStack.push("hello");
        optional = optionalStack.pop();

        if(optional.isPresent()) {
            System.out.println(optional.get());
        }
        optional = optionalStack.pop();

        optional.ifPresent(System.out::println);

    }
}