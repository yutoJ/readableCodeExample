package ex5;

public class Exe {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Tom");
        Customer customer2 = new Customer("Chester");

        Customers customersList = new Customers(customer1,customer2);

        System.out.println(customersList.toString());
    }
}
