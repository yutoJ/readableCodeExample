package ex2;

import commons.vo.units.Quantity;

public class Exe {

    public static void main(String[] args) {
        int numOfPeople = 100;
        Group group = new Group(new Quantity(numOfPeople));

        System.out.println("Number of people: " + group.numOfPeople().value());

        int illegalNumOfPeople = -1;
        Group IllegalGroup = new Group(new Quantity(illegalNumOfPeople));


    }
}
