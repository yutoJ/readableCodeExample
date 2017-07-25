package ex2;

public class Telephone {

    private String number;
    private static final int numOfDegit = 11;

    public Telephone(String number) {
        this.validate(number);
        this.number = number;
    }

    private void validate(String number){
        if (number.length() != numOfDegit ) throw new IllegalArgumentException("Illegal telephone number: the input is " + number + ",it should be " + this.numOfDegit + " degits");
    }
}
