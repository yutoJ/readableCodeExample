package ex2;

import commons.vo.units.Quantity;

public class Group {

    private Quantity numOfPeople;

    public Group(Quantity numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public Quantity numOfPeople(){
        return this.numOfPeople;
    }
}
