package spring.ex14_pending.domain;

public class Customer {

    private String name;

    public Customer(String name) {
        this.isValid(name);
        this.name = name;
    }

    private void isValid(String name){
        if(name.isEmpty()) {
            throw new IllegalArgumentException("Wrong name");
        }
    }
}
