package sample.compare;

import lombok.Data;

import java.util.Comparator;

@Data
public class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.getScore(), getScore());
    }
}
