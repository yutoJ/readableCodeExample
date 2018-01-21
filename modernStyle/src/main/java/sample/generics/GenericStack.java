package sample.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericStack<E> {
    private List<E> taskList;

    public GenericStack() {
        taskList = new ArrayList<>();
    }

    public boolean push(E task){
        return taskList.add(task);
    }

    @Override
    public String toString() {
        return "GenericStack{" +
                "taskList=" + taskList +
                '}';
    }
}
