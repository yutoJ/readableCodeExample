package ex7;

import java.util.ArrayList;
import java.util.List;

public class Reservation {

    private List<Fee> fees;

    public Reservation() {
        fees = new ArrayList<Fee>();
    }

    public void addFee(Fee fee){
        fees.add(fee);
    }

    public Yen feeTotal(){
        Yen total = new Yen(0);
        for(Fee fee : fees){
            total.add(fee.yen());
        }
        return total;
    }
}
