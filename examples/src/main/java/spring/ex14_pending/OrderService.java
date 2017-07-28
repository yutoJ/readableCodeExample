package spring.ex14_pending;

import spring.ex14_pending.domain.Order;

public class OrderService {

    public void register(Order order){
        if(order.isValid()) order.submit();
    }
}
