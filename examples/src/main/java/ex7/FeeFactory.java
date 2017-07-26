package ex7;

import java.util.HashMap;
import java.util.Map;

public class FeeFactory {

    static Map<String, Fee> types = new HashMap<String, Fee>();

    static {
        types.put("adult", new AdultFee());
        types.put("child", new ChildFee());
    }

    static Fee feeByName(String name){
        return types.get(name);
    }

}
