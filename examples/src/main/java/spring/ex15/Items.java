package spring.ex15;

import java.util.List;

public class Items {

    List<Item> items;

    String found(){
        if(items.size() == 0 ) return "Not found";
        return String.format("%s items, found", items.size());
    }

    String checkStatus() {
        if (ischecked()) return "checked";

        return "unchecked";
    }

    private boolean ischecked() {
        return false;
    }

    // HTML
    // <p class=${item.checkStatus}>
}
