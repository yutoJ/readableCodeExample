package sample.stream;

import sample.compare.Student;

import java.util.ArrayList;
import java.util.List;

public class Group {
    List<Student> students = new ArrayList<>();

    public void add(Student student){
        students.add(student);
    }

    public List<Student> getStudents(){
        return students;
    }
}
