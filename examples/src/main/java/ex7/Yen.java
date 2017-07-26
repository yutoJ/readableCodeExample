package ex7;

public class Yen {

    private int value;

    public Yen(int value) {
        this.value = value;
    }

    public void add(Yen other){
        this.value += other.value;
    }

    public int value() {
        return value;
    }
}
