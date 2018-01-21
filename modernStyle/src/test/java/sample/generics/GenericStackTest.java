package sample.generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GenericStackTest {

    @Test
    public void gsSampleTest() {
        GenericStack<String> gs = new GenericStack<>();
        gs.push("java");
        System.out.println(gs.toString());
    }

    @Test
    public void gsUtilSampleTest() {
        List<String> list = new ArrayList<>();
        list.add("scala");
        GenericStack<String> gs = GenericStackUtil.as(list);
        System.out.println(gs);
    }


}