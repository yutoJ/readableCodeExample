package ex6;

public class Customer {

    private final String name;
    private final CustomerType type;

    public Customer(String name, CustomerType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    public String name() {
        return this.name;
    }

    public CustomerType type() {
        return type;
    }
}
