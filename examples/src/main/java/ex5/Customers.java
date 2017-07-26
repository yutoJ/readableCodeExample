package ex5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Customers {
    List<Customer> customers = new ArrayList<Customer>();

    public Customers(Customer... customers) {
        for( Customer customer : customers) {
            this.customers.add(customer);
        }
    }

    private void add(Customer customer){}

    private void removeIfExist(Customer customer){}

    int count(){return customers.size();}

    @Override
    public String toString() {
        return "Customers{" +
                "customers=" + customers +
                '}';
    }


    // hide loop logic
    public Customers primeCustomer(){

        Customers primeCustomers = new Customers();

        Iterator<Customer> it = this.customers.iterator();

        while(it.hasNext()){
            Customer customer = it.next();
            if (customer.name() == "Tom") primeCustomers.add(customer);
        }
        return primeCustomers;
    }

    // unchangable list obecjt is returned.
    public List<Customer> asList(){
        return Collections.unmodifiableList(this.customers);
    }

    //validate size 0, null, not customer object, min and max of list size.

}
