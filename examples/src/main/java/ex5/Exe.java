package ex5;

import java.util.List;

public class Exe {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Tom");
        Customer customer2 = new Customer("Chester");

        Customers customersList = new Customers(customer1,customer2);

        System.out.println(customersList.toString());

        List<Customer> readOnly = customersList.asList();
        System.out.println(readOnly.get(0));

        readOnly.add(new Customer("Martin"));



    }
}
