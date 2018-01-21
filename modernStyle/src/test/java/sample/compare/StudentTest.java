package sample.compare;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import static org.junit.Assert.*;

public class StudentTest {

    List<Student> students = new ArrayList<>();
    List<Student> studentGroup1 = new ArrayList<>();
    List<Student> studentGroup2 = new ArrayList<>();
    List<String> list = new ArrayList<>();
    Logger logger = LogManager.getLogger(StudentTest.class);

    @Before
    public void setup(){
        students.add(new Student("Herry", 30));
        students.add(new Student("Zed", 20));
        students.add(new Student("Alex", 50));

        studentGroup1.add(new Student("Mary", 100));
        studentGroup1.add(new Student("Jones", 70));
        studentGroup1.add(new Student("Ema", 70));

        studentGroup2.add(new Student("Bob", 90));
        studentGroup2.add(new Student("Ton", 40));

        list = Arrays.asList("Robert", "Ann", "James");

    }
    @Test
    public void normalSortTest(){
        Collections.sort(students);
        System.out.println(students.toString());
    }

    @Test
    public void streamSortTest(){
        Collections.sort(students, (student1, student2) -> Integer.compare(student1.getScore(), student2.getScore()));
        System.out.println(students.toString());


    }

    @Test
    public void streamTest(){
        students.stream().filter(s -> s.getScore() >= 30).forEach(s -> System.out.println(s.getName()));
        students.forEach(System.out::println);
        students.forEach(s -> System.out.println(s));
    }

    @Test
    public void streamTest2(){
        IntStream stream = IntStream.range(1,5);
        stream.filter(i -> i > 2).forEach(System.out::print);

        Stream<Integer> scores = students.stream().map(s -> s.getScore());
        scores.forEach(System.out::print);
    }

    @Test
    public void closeStreamTest(){
        List<String> converted = list.stream().filter(p -> p.length() < 4).collect(Collectors.toList());
        System.out.println(converted);
    }

    @Test
    public void intStreamTest(){
        int count = 5;

        String query = IntStream.range(0,count).mapToObj(i -> "?").collect(Collectors.joining(","));
        System.out.println(query);
    }

    @Test
    public void groupByStreamTest(){
        Map<Integer, List<Student>> map = studentGroup1.stream().collect(Collectors.groupingBy(Student::getScore));
        System.out.println(map);
    }

    @Test
    public void listStreamTest(){
        list.replaceAll(s -> s.toUpperCase());
        System.out.println(list);
    }

    @Test
    public void listStreamTest2(){
        logger.info("InfoMessage {}!", "Hello Log4j2");
        List<Integer> integerList = IntStream.of(1,62,31,1,54,31).boxed().collect(Collectors.toList());
    }

}