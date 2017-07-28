package spring.ex14_pending.domain;

public class Item {

    private String name;

    public Item(String name) {
        this.name = name;
    }

    private void isValid(){
    }

    public String name(){
        return this.name;
    }
}
