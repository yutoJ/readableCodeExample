package commons.vo.units;

public class Quantity {

    private static final int MIN =1;
    private static final int MAX = 1000;


    private int value;

    public Quantity(int value) {
        this.value = value;
        this.validate();

    }

    private void validate(){
        if (this.value < MIN) throw new IllegalArgumentException("Illegal value: under " + MIN);
        if (this.value > MAX) throw new IllegalArgumentException("Illegal value: over " + MAX);
    }

    public Quantity add(Quantity other){
        int added = addValue(other);
        return new Quantity(added);
    }


    private int addValue(Quantity other){
        return this.value + other.value;
    }

    public int value(){
        return this.value;
    }

}
