package spring.ex14_pending.respositories;

import spring.ex14_pending.domain.Item;

public class ItemRepository {

    public Item find(String name){
        // dummy
        return new Item("sparking water");
    }
}
